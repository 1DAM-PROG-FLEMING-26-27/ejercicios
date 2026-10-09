package unidad2;

public class Ejercicio19 {

	public static void main(String[] args) {
		int n = 1;
		int f = Integer.parseInt(IO.readln("Número de filas: "));
		int max = 0;
		int digitos = 0;
		String formato = String.format( "%%-%dd ", digitos);
		for (int i=1; i<=f; i++) {
			for (int j=0; j<i; j++) {
				System.out.printf(formato, n);
				n++;
			}
			System.out.println();
		}
		
	}

}
