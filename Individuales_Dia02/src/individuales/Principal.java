package individuales;

import java.util.Scanner;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		//ej01();
		//ej02();
		//ej03();
		//ej04();
		//ej05();
		//ej06();
		//ej07();
		//ej08();
		//ej09();
		//ej10();
		//ej11();

	}
	
public static void ej01() {
		
		
		
		int num1,num2;
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		
		if(num1 == num2) {
			System.out.println("Los números son iguales");
			teclado.close();
		}else {
			System.out.println("Los números no son iguales");
			teclado.close();
		}
	}
	
	public static void ej02() {
		
		
		
		int num1,num2;
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		
		if(num1 > num2) {
			System.out.println("El número 1 es mayor que el número 2");
			teclado.close();
		}else if(num1 < num2) {
			System.out.println("El número 2 es mayor que el número 1");
			teclado.close();
		}else {
			System.out.println("Los números son iguales");
			teclado.close();
		}
	}
	
	public static void ej03() {
		
		
		int num1,num2,num3;
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3 = teclado.nextInt();
		
		if(num1>=num2 && num2>=num3) {
			
			System.out.println(" "+num1+" "+num2+" "+num3);
			
			
		}else if(num1>=num3 && num3<=num2) {
			
			System.out.println(" "+num1+" "+num3+" "+num2);
			
			
		}else if(num2>=num1 && num1>=num3) {
			
			System.out.println(" "+num2+" "+num1+" "+num3);
			
			
		}else if(num2>=num3 && num3>=num1) {
			
			System.out.println(" "+num2+" "+num3+" "+num1);
			
		}
	}
	
	public static void ej04() {
		
		
		double nota;
		System.out.println("Introduce la nota: ");
		nota = teclado.nextDouble();
		
		if(nota<=3.9d) {
			System.out.println("Insuficiente");
			
		}else if(nota>=4d && nota<5.9d) {
			System.out.println("Suficiente");
			
		}else if(nota>6d) {
			System.out.println("Bien");
			
		}
	}
	
	public static void ej05() {
		
		 int d1,d2, m1, m2, a1, a2, dif;

		 System.out.println("Ingrese la primera fecha");
		 System.out.println("Ingrese el dia: ");
		 d1 = teclado.nextInt();
		 System.out.println("Ingrese el mes: ");
		 m1 = teclado.nextInt();
		 System.out.println("Ingrese el año: ");
		 a1 = teclado.nextInt();
		 
		 System.out.println("Ingrese la segunda fecha");
		 System.out.println("Ingrese el dia: ");
		 d2 = teclado.nextInt();
		 System.out.println("Ingrese el mes: ");
		 m2 = teclado.nextInt();
		 System.out.println("Ingrese el año: ");
		 a2 = teclado.nextInt();

		 dif = Math.abs((d1-d2)+((m1-m2)*30)+((a1-a2)*365));                
		 System.out.println("La diferencia entre la primer y la segunda fecha es de: "+dif+" días"); 
		 teclado.close();
		
	}
	
	public static void ej06() {
		
		
		int numero,cuadrado;
		System.out.println("Introduce el número: ");
		
		numero = teclado.nextInt();
		
		while(numero>=0) {
			cuadrado = numero * numero;//Operación mat. cuadrado de números
			System.out.println("El cuadrado de "+numero+ " es "+cuadrado);
			System.out.println("Introduce otro número:");
			numero = teclado.nextInt();
		}
	}
	
	public static void ej07() {
		
		int sueldos;
        int cont_sueldos=0;
        int suma_suel=0;
       
        for(int i=0; i<=9; i++)
        {
            System.out.println("Introduzca 10 sueldos");
            sueldos=teclado.nextInt();
           
            suma_suel=suma_suel+sueldos;
           
            if(sueldos>2000){
                cont_sueldos++;
            }
        }//fin de for
       
        System.out.println("Suma de los sueldos: "+suma_suel);
        System.out.println("Mayores de 2000: " +cont_sueldos);
	}
	
	public static void ej08() {
		
		int num;
            
        do {            
            System.out.println("Ingresa un número (del 0  al 10): ");
            num = teclado.nextInt();
        } while ( 0 <= num && num >= 10);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
	}
	
	public static void ej09() {
		int suma=0;
		
		for(int i = 1; i<= 4; i++) {
			for(int j=3; j>=0; j--) {
				suma = ((i * 10) + j);
				System.out.println("i x 10 + j" + suma);
			}
		}
	}
	
	public static void ej10() {
		String username = "admin";
		String passwd = "abc123";
		
		System.out.println("Introduce el nombre del usuario: ");
		String user1 = teclado.nextLine();
		
		
		System.out.println("Introduce la contraseña: ");
		String passw1 = teclado.nextLine();
		
		if((user1.equals(username)) && (passw1.equals(passw1))) {
			System.out.println("Sesión iniciada correctamente"+ "\nQuieres cambiar la contraseña(s/n): ");
			String opc = teclado.nextLine();
			
			if(opc.toLowerCase().equals("s")) {
				System.out.println("Escribir la nueva clase: ");
				passwd = teclado.nextLine();
				System.out.println("Clave cambiada con éxito. \nUsuario: "+ username + "\nClave: "+ passwd);
			}else if(opc.toLowerCase().equals("n")) {
				System.out.println("---------------Fin del programa-------------");
			}
		}
	}
	
	public static void ej11() {
		for(int i=0; i<10; i++) {
			i = i++;
			System.out.println("Hola mundo");
		}
	}

}
