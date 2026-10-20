package unidad3.regex;

public class Ejercicio02 {

	public static void main(String[] args) {
		String regex = "(?:\\d{2}(\\/|\\-)\\d{2}\\1\\d{4})|(?:\\d{2}-\\p{L}{3}-\\d{4})";
		String fecha;
		while ((fecha = IO.readln("Fecha: ")) != null) {
//			if (fecha.matches(regex))
//				System.out.println("La fecha es correcta.");
//			else
//				System.out.println("La fecha es incorrecta.");
			System.out.println("La fecha es " + (fecha.matches(regex) ? "correcta" : "incorrecta"));
		}
	}
	// "((ene|feb|mar...)|(jan|feb|mar|apr...))"
}
