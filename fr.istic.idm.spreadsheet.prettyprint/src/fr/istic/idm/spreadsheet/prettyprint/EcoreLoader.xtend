package fr.istic.idm.spreadsheet.prettyprint

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class EcoreLoader
{
	def static EPackage loadEcore(String path) {
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(
			"ecore", new XMIResourceFactoryImpl)

		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createURI(path), true)

		return res.contents.head as EPackage
	}
}
