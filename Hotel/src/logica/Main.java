package logica;

public class Main {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente("Arturo",32,"768345120R",250.32f);
		cli1.imprimirCliente();
		Habitaciones hab1 = new Habitaciones(2,7.5f);		
		System.out.println(hab1.calculoNoches(hab1.getDias(), hab1.getValorDias()));

	}

}
