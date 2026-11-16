package unidad3.arrays;

public class Ejercicio09 {

	static Integer centro(int [] v) {
		for (int c=0; c<v.length; c++) {
			int sumaIzquierda = 0;
			for (int i=0; i<c; i++)
				sumaIzquierda += (c - i) * v[i];
			int sumaDerecha = 0;
			for (int j=c+1; j<v.length; j++)
				sumaDerecha += (j - c) * v[j];
			if (sumaIzquierda == sumaDerecha)
				return c;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		int [] v = {6, 2, 3, 0, 1};
		Integer centro = centro(v);
		IO.println(centro != null ? "Centro = " + centro : "El vector no tiene centro");
	}
}
