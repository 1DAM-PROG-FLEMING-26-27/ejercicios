package unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio04 {

	static Random r = new Random();
	
	public static void main(String[] args) {
//		int tamaño = Integer.parseInt(IO.readln("Tamaño del vector (entre 10 y 200): "));
//		while (tamaño < 10 || tamaño > 200)
//			tamaño = Integer.parseInt(IO.readln("Tamaño incorrecto, introdúcelo de nuevo: "));
//		int [] v = new int[tamaño];
//		for (int i=0; i<v.length; i++)
//			v[i] = r.nextInt(201) - 100;
		int [] v = {-1, 21, 5, 0, 1, 2, 3, 4, 5, 6, 7, 8, -9, 13, 11, 5, 1};
		int suma = 0;
		int aux = 0;
		int contador = 0;
		for (int i=0; i<v.length; i++) {
			if (v[i] != 13) {
				if (aux == 0)
					suma += v[i];
				else {
					aux += v[i];
					contador++;
					if (contador == 14) {
						if (aux == 7)
							suma += aux;
						aux = contador = 0;
					}
				}
			}
			else {
				aux = 13;
			}
		}
		if (aux == 7)
			suma += aux;
		System.out.println(Arrays.toString(v));
		System.out.println("Suma = " + suma);
	}

}
