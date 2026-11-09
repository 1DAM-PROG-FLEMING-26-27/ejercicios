package unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio10 {

	public static void main(String[] args) {
		Random r = new Random();
		int fil = r.nextInt(19) + 2;
		int col = r.nextInt(19) + 2;
		long [][] m = new long[fil][col];
		
		long [][] v = {{35, 45, 55}, {65, 75}, {85}, {1, 3, 5, 7, 9}};
		long [] sumas = sumaColumnas(v);
		System.out.println(Arrays.toString(sumas));
	}
	
	static long [] sumaFilas(long m[][]) {
		if (m.length == 0)
			return null;
		long [] sumas = new long[m.length];
		for (int i=0; i<m.length; i++) {
			sumas[i] = 0;
			for (int j=0; j<m[i].length; j++) {
				sumas[i] += m[i][j];
			}
		}
		return sumas;
	}
	
	static long [] sumaColumnas(long m[][]) {
		if (m.length == 0)
			return null;
		
		int col = m[0].length;
		for (int i=1; i<m.length; i++)
			if (col < m[i].length)
				col = m[i].length;
		
		long [] sumas = new long[col];
		for (int j=0; j<col; j++) {
			sumas[j] = 0;
			for (int i=0; i<m.length; i++) {
				try {
					sumas[j] += m[i][j];
				} catch (ArrayIndexOutOfBoundsException e) {
				}
			}
		}
		return sumas;
	}

}
