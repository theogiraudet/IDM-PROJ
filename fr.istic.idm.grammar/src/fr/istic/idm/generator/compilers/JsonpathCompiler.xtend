package fr.istic.idm.generator.compilers

import fr.istic.idm.swag.Path
import fr.istic.idm.swag.Node
import fr.istic.idm.swag.BasicNode
import fr.istic.idm.swag.ArrayNode
import fr.istic.idm.swag.ListFilter
import fr.istic.idm.swag.IndexFilter
import fr.istic.idm.swag.AllFilter
import fr.istic.idm.swag.BoundFilter
import fr.istic.idm.swag.ExistFilter
import fr.istic.idm.swag.EqualFilter
import fr.istic.idm.swag.JsonBoolean
import fr.istic.idm.swag.JsonValue
import fr.istic.idm.swag.JsonNumber
import fr.istic.idm.swag.JsonNull
import fr.istic.idm.swag.JsonString

class JsonpathCompiler implements Compiler {

	boolean piped = false;

	override compile(Path path) {
		var String rtn = compilePath(path)
		if(piped) {
			rtn = "// Piped queries\n" + rtn
		}
		return rtn
	}

	private def String compilePath(Path path) {
		"$." + path.nodes.map[compileNode].join(".")
	}

	private def String compileNode(Node node) {
		return switch (node) {
			BasicNode: node.str
			ArrayNode: node.str + compileFilter(node.filter)
			default: ""
		}
	}

	private def String compileFilter(ListFilter listFilter) {
		var String rtn = ""
		for (filter : listFilter.filter) {
			if(filter != listFilter.filter.head) {
				piped = true
				rtn += "\n$."
			}
			rtn += "["
			switch (filter) {
				AllFilter: rtn += "*"
				BoundFilter: rtn += compileBoundFilter(filter)
				EqualFilter: rtn += compileEqualFilter(filter)
				ExistFilter: rtn += compileExistFilter(filter)
				IndexFilter: rtn += filter.index
				default: rtn += ""
			}
			rtn += "]"
		}
		return rtn
	}
	
	private def String compileBoundFilter(BoundFilter boundFilter) {
		var String rtn = ""
		if(boundFilter.min !== null)
			rtn += boundFilter.min.number
		rtn += ":"
		if(boundFilter.max !== null)
			rtn += boundFilter.max.number
		return rtn
	}
	
	private def String compileEqualFilter(EqualFilter equalFilter) {
		val String path = compilePath(equalFilter.path).substring(1)
		var rtn = "?(@" + path + " == "
		val JsonValue value = equalFilter.value
		switch (value) {
			JsonBoolean: rtn += value.bool
			JsonNumber: rtn += value.number
			JsonNull: rtn += "null"
			JsonString: rtn += "'" + value.value + "'"
			default: rtn += ""
		}
		return rtn + ")"
	}
	
	private def String compileExistFilter(ExistFilter existFilter) {
		val String path = compilePath(existFilter.path).substring(1)
		return "?(@" + path + ")"
	}
	
	override getExtension() {
		return ".jp"
	}

}
