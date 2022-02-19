/*
 * generated by Xtext 2.25.0
 */
package fr.istic.idm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.istic.idm.swag.Path
import fr.istic.idm.generator.compilers.JqCompiler
import fr.istic.idm.generator.compilers.Compiler

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SwagGenerator extends AbstractGenerator {
	
	public static Compiler compiler

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if(compiler === null) {
			compiler = new JqCompiler()
		}
		fsa.generateFile(
			'result' + compiler.extension,
			compiler.compile(resource.allContents.filter(Path).head)
		)
	}
}
