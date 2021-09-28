package ejercicio3;

public class Directivo extends Empleado {
private String socio;
	
	public Directivo() {
		super();
		
	}

	public Directivo(String nombre, String apellido1, String apellido2, String direccion, String foro, String email,
			String departamento, double sueldo, String socio) {
		super(nombre, apellido1, apellido2, direccion, foro, email, departamento, sueldo);
		this.socio = socio;
		
	}

	public String getSocio() {
		return this.socio;
	}

	public void setSocio(String socio) {
		this.socio = socio;
	}
	
	public void verSocio() {
		
		
		System.out.println("El Operario con nombre "+super.getNombre()+" y apellidos "+super.getApellido1()+" , "+super.getApellido2()+" se encuentra en el grado de "+this.getSocio()+ ". El directivo tiene un sueldo de "+super.getSueldo());
		
	}
}
