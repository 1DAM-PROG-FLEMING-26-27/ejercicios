package unidad2;

public class Ejercicio15 {

	public static void main(String[] args) {
		int producto = 1;
		int n = 3;
		int cont = 1;
		while (cont < 200000) {
			if (!esPar(n)) {
				producto = producto * n;
				cont++;
			}
			n++;
		}
		System.out.println(producto);
	}

	static boolean esPar(int n) {
		return n % 2 == 0;
	}

}
