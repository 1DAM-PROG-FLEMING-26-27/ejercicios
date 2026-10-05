package unidad2;

import java.util.Random;

public class Ejercicio11 {

//	public static void main(String[] args) {
//		Random r = new Random();
//		int n;
//		int contador = 0;
//		do {
//			n = r.nextInt();
//			if (n % 2 != 0) {
//				System.out.print(n + "  ");
//				contador++;
//			}
//		} while (n % 2 != 0);
//		if (contador == 0)
//			System.out.println("No se han encontrado números impares.");
//		else
//			if (contador == 1)
//				System.out.println("Se ha encontrado un número impar.");
//			else
//				System.out.println("Se han encontrado " + contador + " números impares");
//	}

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt();
		int contador = 0;
		while (n % 2 != 0) {
			System.out.print(n + "  ");
			contador++;
			n = r.nextInt();
		}
		if (contador == 0)
			System.out.println("No se han encontrado números impares.");
		else
			if (contador == 1)
				System.out.println("Se ha encontrado un número impar.");
			else
				System.out.println("Se han encontrado " + contador + " números impares");
	}
	
}
