package idm.speedtest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import net.thisptr.jackson.jq.BuiltinFunctionLoader;
import net.thisptr.jackson.jq.JsonQuery;
import net.thisptr.jackson.jq.Scope;
import net.thisptr.jackson.jq.Versions;
import net.thisptr.jackson.jq.module.loaders.BuiltinModuleLoader;

public class Main {
	
	static String json = "";

	// Jq
	private static Scope rootScope;
	private static final ObjectMapper MAPPER = new ObjectMapper();
	private static JsonNode in;
	
	public static void main(String[] args) {
		Path fileName = Path.of("demo.json");
		try {
			json = Files.readString(fileName);
			// JsonPath
			JsonPath.read(json, "$");

			// Jq
			rootScope = Scope.newEmptyScope();
			BuiltinFunctionLoader.getInstance().loadFunctions(Versions.JQ_1_6, rootScope);
			rootScope.setModuleLoader(BuiltinModuleLoader.getInstance());
			
			in = MAPPER.readTree(json);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// JsonPath
		//testJsonPathSpeed("$");
		//testJsonPathSpeed("$['contacts'][*]");
		//testJsonPathSpeed("$['contacts'][:2]");
		//testJsonPathSpeed("$['contacts'][?(@['firstName'] == 'Becky')]");
		//testJsonPathSpeed("$['contacts'][0]['age']");
		//testJsonPathSpeed("$['contacts'][?(@['address'])]['address']['city']");
		//testJsonPathSpeed("$['contacts'][1]['phoneNumbers'][?(@['type'] == 'work')]");
		//testJsonPathSpeed(List.of("$['contacts'][?(@['age'] == 22)]", "$[0]"));

		// Jq
		//testJqSpeed(".");
		//testJqSpeed(".contacts | [ .[]]");
		//testJqSpeed(".contacts | .[:2]");
		//testJqSpeed(".contacts | map(select(.firstName == \"Becky\"))");
		//testJqSpeed(".contacts | .[0] | .age");
		//testJqSpeed(".contacts | map(select(.address?)) | .[].address | .city");
		//testJqSpeed(".contacts | .[1] | .phoneNumbers | map(select(.type == \"work\"))");
		//testJqSpeed(".contacts | map(select(.age == 22)) | .[0]");
	}
	
	private static void testJsonPathSpeed(String request) {
		System.out.println("Request: " + request);
		long time = System.currentTimeMillis();
		System.out.println("Result: " + JsonPath.read(json, request));
		time = System.currentTimeMillis() - time;
		System.out.println("Time: " + time + "ms.\n");
	}
	
	private static void testJsonPathSpeed(List<String> requests) {
		String crtJson = json;
		long totalTime = 0;
		for (String request : requests) {
			System.out.println("Request: " + request);
			long time = System.currentTimeMillis();
			crtJson = JsonPath.read(crtJson, request).toString();
			time = System.currentTimeMillis() - time;
			totalTime += time;
		}
		System.out.println("Result: " + crtJson);
		System.out.println("Time: " + totalTime + "ms.\n");
	}
	
	private static void testJqSpeed(String request) {
		try {
			System.out.println("Request: " + request);
			long time = System.currentTimeMillis();
			JsonQuery q = JsonQuery.compile(request, Versions.JQ_1_6);
			final List<JsonNode> out = new ArrayList<>();
			q.apply(rootScope, in, out::add);
			time = System.currentTimeMillis() - time;
			System.out.println("Result: " + out);
			System.out.println("Time: " + time + "ms.\n");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
