package unidad2;

public class Ejercicio20 {

	public static void main(String[] args) {
		int f = Integer.parseInt(IO.readln("Número de filas: "));
		
		for (int i=1; i<=f; i++) {
			for (int j=f-i+1; j>0; j--)
				System.out.print('*');
			System.out.println();
		}
		
//		for(int i = f; i > 0; i--) {
//			for(int k = 0; k < f - i; k++) {
//				System.out.print(" ");
//			}
//			for(int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < f; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < f - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=f; i++) {
			for (int j=0; j<i; j++)
				System.out.print('*');
			System.out.println();
		}
		
		for(int i = 0; i < f; i++) {
			for(int j = 1; j < f - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
