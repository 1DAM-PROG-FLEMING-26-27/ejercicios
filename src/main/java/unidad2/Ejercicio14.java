package unidad2;

public class Ejercicio14 {

	public static void main(String[] args) {
		int suma = 0;
		int contador = 0;
		float edadMedia;
		int menoresDeEdad = 0;
		Integer edad = leerEdad("Introduce la edad de un alumno: ")
		while (edad != null) {
				suma += edad;
				contador++;
				if (edad < 18)
					menoresDeEdad++;
				edad = leerEdad("Introduce la edad de otro alumno: ");
		}
		edadMedia = (float) suma / (float) contador;
		System.out.printf("\nSuma de todas las edades: %d\n", suma);
		System.out.printf("Edad media: %f\n", edadMedia);
		System.out.printf("Número de alumnos menores de edad: %d\n", menoresDeEdad);
	}

	static Integer leerEdad(String mensaje) {
		boolean correcta = false;
		Integer edad = null;
		String linea = IO.readln(mensaje);
		while (!correcta) {
			if (linea == null)
				return null;
			else
				try {
					edad = Integer.parseInt(linea);
					correcta = true;
				} catch (NumberFormatException e) {
					linea = IO.readln("Edad incorrecta, introdúcela de nuevo: ");
				}
		}
		return edad;
	}

}
