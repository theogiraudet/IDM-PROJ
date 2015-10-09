package fr.istic.idm.spreadsheet.prettyprint

import org.eclipse.emf.ecore.EPackage

class PrettyPrintEcore
{
	def void printFlat(EPackage pkg) {
		throw new UnsupportedOperationException
	}

	def void printShort(EPackage pkg) {
		throw new UnsupportedOperationException
	}

	def void printFlatShort(EPackage pkg) {
		throw new UnsupportedOperationException
	}

	def static void main(String[] args) {
		val ppe = new PrettyPrintEcore
		val pkg = EcoreLoader::loadEcore(
			"../fr.istic.idm.spreadsheet.model/model/spreadsheet.ecore")

		println('''printFlat(«pkg.name»):''')
		ppe.printFlat(pkg)

		println('''printShort(«pkg.name»):''')
		ppe.printShort(pkg)

		println('''printFlatShort(«pkg.name»):''')
		ppe.printFlatShort(pkg)
	}
}
