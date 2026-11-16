package unidad3.arrays;

import java.util.ArrayList;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		String nombre;
		while ((nombre = IO.readln("Nombre: ")) != null) {
			lista.add(nombre);
		}
		String max = null;
		for (String s: lista)
			if (max == null || s.length() > max.length())
				max = s;
		IO.println(max);
	}
	
}
