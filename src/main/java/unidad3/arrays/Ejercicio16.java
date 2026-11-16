package unidad3.arrays;

import java.util.Arrays;

public class Ejercicio16 {

	static void rellenar(char [][] m, int filaInicial, int columnaInicial, char relleno) {
		char aux = m[filaInicial][columnaInicial];
		m[filaInicial][columnaInicial] = relleno;
		for (int i = filaInicial - 1; i <= filaInicial + 1; i++)
			for (int j = columnaInicial - 1; j <= columnaInicial + 1; j++)
				if (i >= 0 && i < m.length && j >=0 && j < m[i].length && m[i][j] == aux)
					rellenar(m, i, j, relleno);
				
	}
	
	static long factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
	
	static void imprimirMatriz(char [][] m) {
		for (int i=0; i<m.length; i++)
			IO.println(Arrays.toString(m[i]));
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(3));
		char [][] m = {
				{'#', '*', '*', '*', '*'},
				{'*', '*', '#', '*', '*'},
				{'*', '#', '#', '#', '#'},
				{'*', '*', '*', '*', '*'}
		};
		imprimirMatriz(m);
		rellenar(m, 2, 3, '$');
		IO.println();
		imprimirMatriz(m);
	}
	
}
