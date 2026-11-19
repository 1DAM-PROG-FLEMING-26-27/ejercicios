package unidad4;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal("Pepe", LocalDate.of(2021, 3, 23));
		Animal a2 = new Animal("Pepín");
		System.out.println(a1);
		System.out.println(a2);
	}

}
