package fr.istic.idm.generator.compilers

import fr.istic.idm.swag.Path
import fr.istic.idm.swag.Node
import fr.istic.idm.swag.BasicNode
import fr.istic.idm.swag.ArrayNode
import fr.istic.idm.swag.ListFilter
import fr.istic.idm.swag.IndexFilter
import fr.istic.idm.swag.AllFilter
import fr.istic.idm.swag.BoundFilter

class JsonpathCompiler implements Compiler {

	override compile(Path path) {
		compilePath(path)
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
		var String rtn = "["
		for (filter : listFilter.filter) {
			switch (filter) {
				AllFilter: rtn += "*"
				IndexFilter: rtn += filter.index
				BoundFilter: rtn += compileBoundFilter(filter)
				default: rtn += ""
			}
		}
		return rtn + "]"
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

}
