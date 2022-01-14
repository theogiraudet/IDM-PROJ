package fr.istic.idm.generator.compilers

import fr.istic.idm.swag.Path

interface Compiler {
	
	def String compile(Path path)
	
}