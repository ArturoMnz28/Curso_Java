package ejercicio04;

public class Publicacion {
	private String codigo;
	private String titulo;
	private int anio;
	
	
	public Publicacion(String codigo, String titulo, int anio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anio = anio;
	}


	public Publicacion() {
		
	}


	public String getCodigo() {
		return this.codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return this.titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAnio() {
		return this.anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", anio=" + anio + "]";
	}
	
	


	
	
	
	
}
