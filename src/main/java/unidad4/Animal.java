package unidad4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Animal {

	private String nombre;
	private LocalDate fecha;
	
	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
//	public Animal(String nombre) {
//		this(nombre, LocalDate.now());
//	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
		fecha = LocalDate.now();
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Edad:" + ChronoUnit.YEARS.between(fecha, LocalDate.now());
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
}
