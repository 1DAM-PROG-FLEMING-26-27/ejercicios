package unidad2;

public class Ejercicio01 {

	public static void main(String[] args) {
		double a = Double.parseDouble(IO.readln("Introduce un número: "));
		double b = Double.parseDouble(IO.readln("Introduce otro número: "));
		if (b == 0)
			System.out.println("No se puede dividir entre cero.");
		else
			System.out.println(a / b);
	}

}
