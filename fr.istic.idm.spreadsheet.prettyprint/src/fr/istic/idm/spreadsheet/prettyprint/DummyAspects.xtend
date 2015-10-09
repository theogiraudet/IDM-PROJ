package fr.istic.idm.spreadsheet.prettyprint

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage

import static extension fr.istic.idm.spreadsheet.prettyprint.DummyEClassifierAspect.*

@Aspect(className = EPackage)
class DummyEPackageAspect {
	def void printHash() {
		println(_self.hashCode)
		_self.EClassifiers.forEach[printHash]
	}
}

@Aspect(className = EClassifier)
class DummyEClassifierAspect {
	def void printHash() {
		println("\t" + _self.hashCode)
	}
}
