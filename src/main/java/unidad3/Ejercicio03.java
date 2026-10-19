package unidad3;

public class Ejercicio03 {

//	public static void main(String[] args) {
//		String s1 = IO.readln("Cadena: ");
//		String s2 = IO.readln("Subcadena: ");
//		int contador = 0;
//		int i = 0;
//		do {
//			i = s1.indexOf(s2, i);
//			if (i >= 0) {
//				contador++;
//				i++;
//			}
//		} while (i >= 0);
//		System.out.println("Resultado: " + contador);
//	}
	
	public static void main(String[] args) {
		String s1 = IO.readln("Cadena: ");
		String s2 = IO.readln("Subcadena: ");
		System.out.println("Resultado: " + númeroDeVecesQueEstáContenida(s1, s2));
	}
		
	static int númeroDeVecesQueEstáContenida(String s1, String s2) {
		int contador = 0;
		int i = 0;
		while ((i = s1.indexOf(s2, i)) >= 0) {
			contador++;
			i++;
		}
		return contador;
	}

}
