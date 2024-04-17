package service;

/*Crear una clase llamada Cuenta, que defina operaciones
sobre una cuenta bancaria.
La clase tendrá un atributo saldo y los siguientes métodos:
-ingresar(double cantidad)
-extraer(double cantidad)
-obtenerSaldo() */

public class Cuenta {
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public Cuenta() {
		saldo=200;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodos
	
	public void ingresar(double cantidad) {
		
		saldo+=cantidad;
		
		
	}
	 
	public void extraer(double cantidad) {
		
		saldo-=cantidad;

		
	}
	
	
	public double obtenerSaldo() {
		
		
		
		return saldo;
		
		
		
	}
	

}
