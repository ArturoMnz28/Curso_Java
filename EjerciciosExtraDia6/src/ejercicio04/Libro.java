package ejercicio04;

public class Libro extends Publicacion implements Prestable {
	
	
	private boolean prestado;

	

	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		prestado = false;
	}
	
	



	public boolean getPrestado() {
		return prestado;
	}





	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}





	@Override
	public void prestar() {
		this.setPrestado(true);
		
	}



	@Override
	public void devolver() {
		
		this.setPrestado(false);
		
	}



	@Override
	public boolean prestado() {
		
		boolean prestadoA = false;
		if(this.getPrestado() == true) {
			prestadoA = true;
		}
		return prestadoA;
	}



	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + "]";
	}
	
	
	
	
	
	
}
