package unidad2;

public class Ejercicio04 {

//	public static void main(String[] args) {
//		int n = Integer.parseInt(IO.readln("Número del mes: "));
//		
//		switch (n) {
//		case 1, 3, 5, 7, 8, 10, 12:
//			System.out.println("El mes " + n + " tiene 31 días");
//			break;
//		case 2:
//			System.out.println("Febrero tiene 28 días");
//			break;
//		default:
//			System.out.println("No existe ese mes");
//			break;
//		case 4, 6, 9, 11:
//			System.out.println("El mes " + n + " + tiene 30 días");
//		}		
//	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("Número del mes: "));
		
		if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
			System.out.println("El mes " + n + " tiene 31 días");
		else if (n == 2)
			System.out.println("Febrero tiene 28 días");
		else if (n == 4 || n == 6 || n == 9 || n == 11)
			System.out.println("El mes " + n + " + tiene 30 días");
		else
			System.out.println("No existe ese mes");		
	}
	
}
