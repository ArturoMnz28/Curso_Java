package ejercicio02;

import java.util.Scanner;

public class Cuenta {
	
	private int numCuenta;
	private String nombreTitular;
	private double saldo,interesAnual;
	
	
	
	public Cuenta(int numCuenta, String nombreTitular, double saldo, double interesAnual) {
		super();
		this.numCuenta = numCuenta;
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
	}
	
	public Cuenta() {
		
	}
	
	public int getNumCuenta() {
		return this.numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getNombreTitular() {
		return this.nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getInteresAnual() {
		return this.interesAnual;
	}
	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	public void depositar() { 
		double deposito; 
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("CANTIDAD QUE SE QUIERE DEPOSITAR"); 
		deposito = scan.nextDouble();
		this.saldo = this.saldo + deposito; 
		
		System.out.println("Su saldo actual es de " + this.saldo + "€"); 
	} 
	
	public void retirar() { 
		double retiro; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CANTIDAD QUE SE QUIERE RETIRAR"); 
		retiro = scan.nextDouble();		
		this.saldo = this.saldo - retiro;
		
		System.out.println("Su saldo actual es de " + this.saldo + "€");
	} 
	
	
	public void saldo() { 
		System.out.println("Su saldo actual es " + this.saldo + "€"); 
	} 
	
	public void conversion() { 
		double a = 1.17d;//conversion a dolares estadounidenses
		System.out.println("Su saldo actual es " + this.saldo*a + " USD"); 
	}
}
