package unidad3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio04 {

//	public static void main(String[] args) {
//		String s1 = IO.readln("Cadena 1: ");
//		String s2 = IO.readln("Cadena 2: ");
//		
//		String palabra = "";
//		for (int i=0; i<s1.length(); i++) {
//			char c = s1.charAt(i); 
//			if (c != ' ' && i != s1.length() - 1) 
//				palabra += c;
//			else {
//				if (c != ' ')
//					palabra += c;
//				int n = Ejercicio03.númeroDeVecesQueEstáContenida(s2, palabra);
//				System.out.println(palabra + " se repite " + n + " veces");
//				palabra = "";
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		String s1 = IO.readln("Cadena 1: ");
//		String s2 = IO.readln("Cadena 2: ");
//		
//		String [] palabras = s1.strip().split("\\s+");
//		for (int i=0; i<palabras.length; i++) {
//			int n = Ejercicio03.númeroDeVecesQueEstáContenida(s2, palabras[i]);
//			System.out.println(palabras[i] + " se repite " + n + " veces");
//		}
//	}
	
	public static void main(String[] args) {
		String s1 = IO.readln("Cadena 1: ");
		String s2 = IO.readln("Cadena 2: ");
		Matcher m = Pattern.compile("\\S+").matcher(s1);
		while (m.find()) {
			int n = Ejercicio03.númeroDeVecesQueEstáContenida(s2, m.group());
			System.out.println(m.group() + " se repite " + n + " veces");
		}
	}
	
}
