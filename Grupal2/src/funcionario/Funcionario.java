package funcionario;

public class Funcionario {
	
	private String rut;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String domicilio;
	private String fecha_nacimiento;
	private double sueldo_bruto;
	
	//Constructor sin parámetros
	public Funcionario() {
		
	}
	
	//Constructor con parámetros
	public Funcionario(String rut, String nombre, String apellido1, String apellido2, String domicilio,
			String fecha_nacimiento, double sueldo_bruto) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.domicilio = domicilio;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sueldo_bruto = sueldo_bruto;
	}

	//Métodos getters y setters
	public String getRut() {
		return this.rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return this.apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return this.apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getDomicilio() {
		return this.domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getFecha_nacimiento() {
		return this.fecha_nacimiento;
	}


	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public double getSueldo_bruto() {
		return this.sueldo_bruto;
	}


	public void setSueldo_bruto(double sueldo_bruto) {
		this.sueldo_bruto = sueldo_bruto;
	}
	
	//Método que imprime los atributos del funcionario
	public void getAtributos() {
		System.out.println("Datos del funcionario: "+this.getRut()+" , "+this.getNombre()+" , "+this.getApellido1()+" , "+this.getApellido2()+" , "+this.getDomicilio()+" , "+this.getFecha_nacimiento()+" , "+this.getSueldo_bruto());
	}
	
	
	
	
}
