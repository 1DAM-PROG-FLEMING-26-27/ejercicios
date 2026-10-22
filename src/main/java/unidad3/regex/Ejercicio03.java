package unidad3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Locale;

public class Ejercicio03 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(">>(\\p{L}+)<<(\\d+(?:,\\d{1,2})?):(\\d+)", Pattern.UNICODE_CHARACTER_CLASS);
		String linea = IO.readln("> ");
		float total = 0;
		while (!linea.equalsIgnoreCase("comprar")) {
			Matcher m = p.matcher(linea);
			if (m.matches()) {
				String nombre = m.group(1);
				float precio = Float.parseFloat(m.group(2).replace(',', '.'));
				String cantidad = m.group(3);
				total += precio;
				
			}
			linea = IO.readln("> ");
		}
	}
	
}
