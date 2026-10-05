package unidad2;

import java.util.Random;

public class Ejercicio12 {

	public static void main(String[] args) {
		Random r = new Random();
		int maximo = Integer.parseInt(IO.readln("Introduce un número entero mayor que 0: "));
		int numero = 0;
		int contador = 0;
		
		if(maximo > 0) {
			do {
				int i = r.nextInt(900) + 100;
				numero += i;
				contador ++;
			} while(numero<=maximo);
			
			System.out.println("Resultado de la suma: " + numero);
			System.out.println("Cantidad de valores acumulados: "+ contador);
		} else {
			System.out.println("Has introducido un numero menor o igual a 0");
		}
		
	}

}
