package unidad3.arrays;

public class Ejercicio05 {

	static Integer encontrarValorMaximo(int[] v) {
		if (v.length == 0) 
			return null;
//		int max = v[0];
//		for (int i=1; i<v.length; i++) {
//			if (v[i] > max )
//				max = v[i];
//		}
//		return max;
		
		int imax = 0;
		for (int i=1; i<v.length; i++) {
			if (v[i] > v[imax] )
				imax = i;
		}
		return v[imax];
	}
	
	static Double mediaExacta (int[] v) {
		if (v.length == 0) 
			return null;
		double suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma += v[i];
		}
		double media = suma / v.length;
		return media;
	}
	
	public static void main(String[] args) {
		int max = encontrarValorMaximo(new int [0]);
	}
}
