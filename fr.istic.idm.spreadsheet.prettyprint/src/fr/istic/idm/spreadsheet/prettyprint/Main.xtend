package fr.istic.idm.spreadsheet.prettyprint

import static extension fr.istic.idm.spreadsheet.prettyprint.DummyEPackageAspect.*

class Main {
	def static void main(String[] args) {
		val pkg = EcoreLoader::loadEcore(
			"../fr.istic.idm.spreadsheet.model/model/spreadsheet.ecore")

		/* Pretty-printing with PrettyPrintEcore */
		val ppe = new PrettyPrintEcore
		println('''printFlat(«pkg.name»):''')
		ppe.printFlat(pkg)

		println('''printShort(«pkg.name»):''')
		ppe.printShort(pkg)

		println('''printFlatShort(«pkg.name»):''')
		ppe.printFlatShort(pkg)

		println
		println("=============================")
		println

		/* Pretty-printing with aspects */
		pkg.printHash

		// The following methods must be implemented using @Aspect
		//     pkg.printFlat
		//     pkg.printShort
		//     pkg.printFlatShort
	}
}
