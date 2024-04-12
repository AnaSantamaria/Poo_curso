package service;

/*Crear una clase llamada Cuenta, que defina operaciones
sobre una cuenta bancaria.
La clase tendrá un atributo saldo y los siguientes métodos:
-ingresar(double cantidad)
-extraer(double cantidad)
-obtenerSaldo() */

public class Cuenta {
	private double saldo;

	public Cuenta() {
		super();
		this.saldo = saldo;
	}

	public void extraer(double cantidad) {

		this.saldo -= cantidad;
	}

	public void ingresar(double cantidad) {

		this.saldo += cantidad;

	}

	public double obtenerSaldo() {

		return saldo;
	}


	

}
