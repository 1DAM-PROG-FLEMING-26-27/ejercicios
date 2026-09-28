package unidad1;

public class Ejercicio07 {

	public static void main(String[] args) {
		double t = Double.parseDouble(IO.readln("Tiempo: "));
		double d = (5d * t) + ((2d * Math.pow(t, 2)) / 2d);
		System.out.println("Distancia: " + d + " metros");
	}
	
}
