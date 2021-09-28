package personas;

public class Docente extends Persona {
	
	private String asignatura;
	private int notas;
	private float media;
	
	public Docente(String nombre, int edad, String dni, String asignatura, int notas, float media) {
		
		super(nombre, edad, dni);
		this.asignatura= asignatura;
		this.notas = notas;
		this.media = media;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNotas() {
		return notas;
	}

	public void setNotas(int notas) {
		this.notas = notas;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	

	
	
}
