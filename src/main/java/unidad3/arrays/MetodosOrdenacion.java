package unidad3.arrays;

import java.util.Arrays;

public class MetodosOrdenacion {

	public static void main(String[] args) {
		int [] v = {44, 55, 12, 42, 94, 18, 6, 67};
		System.out.println(Arrays.toString(v));
		insercionDirecta(v);
		System.out.println(Arrays.toString(v));
	}
	
	public static void insercionDirecta(int [] v) {
		for (int i=1; i<v.length; i++) {
			int j = 0;
			while (v[i] > v[j] && j < i)
				j++;
			if (j < i) {
				int aux = v[i];
				for (int k=i-1; k>=j; k--)
					v[k+1] = v[k];
				v[j] = aux;
			}
		}
	}
	
}
