/*
 * generated by Xtext 2.25.0
 */
package fr.istic.idm.tests

import com.google.inject.Inject
import fr.istic.idm.swag.Path
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import fr.istic.idm.generator.compilers.JsonpathCompiler
import fr.istic.idm.generator.SwagGenerator
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.GeneratorDelegate
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import fr.istic.idm.SwagStandaloneSetup
import static org.junit.Assert.assertTrue

@ExtendWith(InjectionExtension)
@InjectWith(SwagInjectorProvider)
class SwagCompilationTests {
	@Inject
	ParseHelper<Path> parseHelper


	/*
	 * 
	 * Non-functional test.
	 * Was supposed to compile a certain Swag command to a jsonpath one and compare to the expected result. But it seems I am too dumb to write that test correctly.
	 * Another alternative would have been to directly check what is generated by the compiler without having to take a look at the generated file, but it was impossible for me to understand how to do.
	 *  
	 */
	@Test
	def void baseTestJp() {
		SwagGenerator.compiler = new JsonpathCompiler
		val injector = new SwagStandaloneSetup().createInjectorAndDoEMFRegistration
		var inst = injector.getInstance(SwagCompilationTests)
		inst.runGenerator("1source.swag")
		val set = resourceSetProvider.get
		val resource = set.getResource(URI.createFileURI("result.jp"), true) //throws an exception
		val resource2 = set.getResource(URI.createFileURI("1expected.jp"), true)
		assertTrue(resource.toString().equals(resource2.toString()))
	}
	
	@Inject Provider<ResourceSet> resourceSetProvider

	@Inject IResourceValidator validator

	@Inject GeneratorDelegate generator

	@Inject JavaIoFileSystemAccess fileAccess
	
	def protected runGenerator(String string) {
		// Load the resource
		val set = resourceSetProvider.get
		val resource = set.getResource(URI.createFileURI(string), true)

		// Validate the resource
		val issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
		if (!issues.empty) {
			issues.forEach[System.err.println(it)]
			return
		}

		// Configure and start the generator
		fileAccess.outputPath = './'
		val context = new GeneratorContext => [
			cancelIndicator = CancelIndicator.NullImpl
		]
		generator.generate(resource, fileAccess, context)
		System.out.println('Code generation finished.')
	}
}
