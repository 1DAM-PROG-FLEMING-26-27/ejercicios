package unidad3;

public class Ejercicio02 {

	public static void main(String[] args) {
		String s = IO.readln("Introduce una cadena: ");
		for (int i=s.length()-1; i>=0; i--)
			System.out.print(s.charAt(i));
	}

}
