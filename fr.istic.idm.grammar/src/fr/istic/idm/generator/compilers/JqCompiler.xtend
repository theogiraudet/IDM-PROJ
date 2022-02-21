package fr.istic.idm.generator.compilers

import fr.istic.idm.swag.Path
import fr.istic.idm.swag.Node
import fr.istic.idm.swag.BasicNode
import fr.istic.idm.swag.ArrayNode
import fr.istic.idm.swag.Filter
import fr.istic.idm.swag.IndexFilter
import fr.istic.idm.swag.BoundFilter
import fr.istic.idm.swag.AllFilter
import fr.istic.idm.swag.PathFilter
import fr.istic.idm.swag.ExistFilter
import fr.istic.idm.swag.EqualFilter
import fr.istic.idm.swag.JsonValue
import fr.istic.idm.swag.JsonBoolean
import fr.istic.idm.swag.JsonNull
import fr.istic.idm.swag.JsonNumber
import fr.istic.idm.swag.JsonString
import fr.istic.idm.swag.ComplexPath
import fr.istic.idm.swag.RootPath

class JqCompiler implements Compiler {
	
	boolean needCloseBracket = false;
	String prependNextNode = ""
	
	override compile(Path path) {
		compilePath(path)
	}
	
	private def String compilePath(Path path) {
		return switch(path) {
			RootPath: "."
			ComplexPath: compileComplexPath(path)
		}
	}
	
	private def String compileComplexPath(ComplexPath path) {
		val query = path.nodes.map[compileNode].join(" | ")
		val end = needCloseBracket ? "]" : ""
		needCloseBracket = false
		return query + end
	}
	
	private def String compileNode(Node node) {
		val prepend = prependNextNode
		prependNextNode = ""
		return switch(node) {
			BasicNode: prepend + ".[\"" + node.str + "\"]"
			ArrayNode: prepend + "." + compileArrayNode(node)
		}
	}
	
	private def String compileArrayNode(ArrayNode node) {
		val filters = node.filter?.filter?.map[compileFilter]?.join(" | ")
		return "[\"" + node.str + "\"]" + " | " + (filters !=  "" && filters !== null ? filters : allFilterHandler())
	}
	
	private def String compileFilter(Filter filter) {
		return switch(filter) {
			IndexFilter: ".[" + filter.index + "]"
			BoundFilter: ".[" + (filter.min === null ? "" : filter.min) + ":" + (filter.max === null ? "" : filter.max) + "]"
			AllFilter: allFilterHandler()
			PathFilter: compilePathFilter(filter)
		}
	}
	
	private def String allFilterHandler() {
		needCloseBracket = true
		return "[ .[]"
	}
	
	private def String compilePathFilter(PathFilter filter) {
		val query = "map(select(" + switch(filter) {
			ExistFilter: compilePath(filter.path) + "?"
			EqualFilter: compilePath(filter.path) + " == " + compileJsonValue(filter.value) 
		} + "))"
		prependNextNode = ".[]"
		return query
	}
	
	private def String compileJsonValue(JsonValue value) {
		return switch(value) {
			JsonBoolean: value.bool
			JsonNull: "null"
			JsonNumber: value.number.toString
			JsonString: "\"" + value.value + "\""
		}
	}
	
	override getExtension() {
		return "jq"
	}
	
}