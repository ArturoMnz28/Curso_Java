package ejercicio06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String c = "0";
		int numClientes = 0;
		
		//Variables para los datos del cliente
		String nombreCliente;
		String apellidoCliente;
		String fonoCliente;
		String mailCliente;
		
		//lista de clientes vacía
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		while(!c.equals("0")) {
			//Introducimos la información por teclado
			
			System.out.println("Introduce el nombre del cliente:");
			nombreCliente=teclado.nextLine();
			
			System.out.println("Introduce el apellido del cliente:");
			apellidoCliente=teclado.nextLine();
			
			System.out.println("Introduce el fono del cliente:");
			fonoCliente=teclado.nextLine();
			
			System.out.println("Introduce el mail del cliente:");
			mailCliente=teclado.nextLine();
			
			//Creamos el objeto
			Cliente cli = new Cliente(nombreCliente,apellidoCliente,fonoCliente,mailCliente);
			
			//Lo añadimos a la lista
			clientes.add(cli);
			
			//Aumentamos el número de clientes
			numClientes++;
			
			System.out.println("Si no quiere añadir más clientes pulse 0.");
			c = teclado.nextLine();
			
			//Como el máximo son 10 clientes, cuando llegue a 10 el contador irá a 0 y el bucle terminará
			if(numClientes == 10) {
				c= "0";
			}
		}
		
		//Recorremos nuestra lista de clientes para mostrarlos todos por consola
		for(int i = 0; i<clientes.size(); i++) {
			System.out.println("////////////////////////");
			System.out.println("Nombre del Cliente "+i+" : "+clientes.get(i).getNombre());
			System.out.println("Apellidos del Cliente "+i+" : "+clientes.get(i).getApellido());
			System.out.println("Teléfono del Cliente "+i+" : "+clientes.get(i).getFono());
			System.out.println("Mail del Cliente "+i+" : "+clientes.get(i).getMail());
			System.out.println("////////////////////////");
		}

	}

}
