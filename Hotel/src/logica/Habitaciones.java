package logica;

public class Habitaciones {
	
	private int dias;
	private float valorDias;
	
	public Habitaciones() {
		
	}
	
	public Habitaciones(int dias, float valorDias) {
		this.dias = dias;
		this.valorDias = valorDias;
	}

	public int getDias() {
		return this.dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public float getValorDias() {
		return this.valorDias;
	}

	public void setValorDias(float valorDias) {
		this.valorDias = valorDias;
	}
	
	//Método calculo de noches de hospedaje
	
	public float calculoNoches(int dias, float valorDias) {
		
		float resultado;
		resultado = dias*valorDias;
		
		return resultado;
	}
	
	public float dineroRestante(float dineroDisponible) {
		
		float dinero;
		dinero = dineroDisponible-this.dias*this.valorDias;
		return dinero;
	}
	
}
