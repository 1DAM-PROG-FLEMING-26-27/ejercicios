package unidad3.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio04 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		String html = in.readAllAsString();
		System.out.println(html);
	}
	
}
