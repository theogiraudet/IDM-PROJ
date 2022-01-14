package fr.istic.idm.generator.compilers

import fr.istic.idm.swag.Path
import fr.istic.idm.swag.Node
import fr.istic.idm.swag.BasicNode

class JqCompiler implements Compiler {
	
	override compile(Path path) {
		compilePath(path)
	}
	
	private def String compilePath(Path path) {
		"." + path.nodes.map[compileNode].join(".")
	}
	
	private def String compileNode(Node node) {
		return switch(node) {
			BasicNode: node.str
			default: ""
		}
	}
	
}