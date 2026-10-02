package unidad2;

public class Ejercicio05 {
//	public static void main(String[] args) {
//		String mes = IO.readln("Nombre del mes: ").toLowerCase();
//
//		switch (mes) {
//		case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre":
//			System.out.println("El mes " + mes + " tiene 31 días");
//			break;
//		case "febrero":
//			System.out.println("Febrero tiene 28 días");
//			break;
//		default:
//			System.out.println("No existe ese mes");
//			break;
//		case "abril", "junio", "septiembre", "noviembre":
//			System.out.println("El mes " + mes + " tiene 30 días");
//		}
//	}

	public static void main(String[] args) {
		String mes = IO.readln("Nombre del mes: ");

		if (mes.equalsIgnoreCase("enero") || "marzo".equalsIgnoreCase(mes) || mes == "mayo" ||
				mes == "julio" || mes == "agosto" || mes == "octubre" ||
				mes == "diciembre")
			System.out.println("El mes " + mes + " tiene 31 días");
		else if (mes == "febrero")
			System.out.println("Febrero tiene 28 días");
		else if (mes == "abril" || mes == "junio" ||
				mes == "septiembre" || mes == "noviembre")
			System.out.println("El mes " + mes + " + tiene 30 días");
		else
			System.out.println("No existe ese mes");
	}
}
