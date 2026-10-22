package unidad3.regex.ejemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Texto: ");
		String linea = in.readLine();
		System.out.print("Letra: ");
		String letra = in.readLine();
		String regex = letra + "\\w*";
//		String regex = String.format("%s\\w*", letra);

	}

}
