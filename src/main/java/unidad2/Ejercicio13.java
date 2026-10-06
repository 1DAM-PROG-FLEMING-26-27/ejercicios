package unidad2;

import java.util.Random;

public class Ejercicio13 {

	public static void main(String[] args) {
		Random r = new Random();
		int contador = 0;
		long t0 = System.currentTimeMillis();
		for (int i=1; i<=1000000000; i++) {
			long n = r.nextLong();
			if (n >= -1000000000000000000l && n <= 1000000000000000000l)
				contador++;
		}
//		System.out.println("Pertenecen al intervalor " + contador + "números.");
		System.out.printf("Pertenecen al intervalo %d números.\n", contador);
		long t1 = System.currentTimeMillis();
		System.out.printf("Tiempo empleado: %d milisegundos\n", t1 - t0);
	}

}
