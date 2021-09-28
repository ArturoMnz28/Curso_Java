package ejercicio03;

import java.time.LocalDate;

public class Publicaciones {
	
	private String nombre;
	private LocalDate fecha;
	private boolean prestado;
		
	public Publicaciones(String nombre, LocalDate fecha, boolean prestado) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.prestado = prestado;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
}
