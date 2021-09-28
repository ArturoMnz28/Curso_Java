package ejercicio3;

public class Empleado {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String foro;
	private String email;
	private String departamento;
	private double sueldo;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String apellido1, String apellido2, String direccion, String foro, String email,
			String departamento, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.foro = foro;
		this.email = email;
		this.departamento = departamento;
	}
	
	//Métodos getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getForo() {
		return foro;
	}

	public void setForo(String foro) {
		this.foro = foro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", direccion="
				+ direccion + ", foro=" + foro + ", email=" + email + ", departamento=" + departamento + ", sueldo="
				+ sueldo + "]";
	}
}
