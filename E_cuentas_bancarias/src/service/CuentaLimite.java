package service;
/*
 * clase CuentaLimite Clase que hereda Cuenta. Incorporará un atributo "limite",
 * para limitar la extracción a dicho valor. Además, añadiremos un método
 * ajustarLimite(), que fijará el límite en la mitad del saldo
 */

public class CuentaLimite extends Cuenta {
	private double limite;

	public CuentaLimite(double limite, double saldo) {// constructor todos los parametros

		this.limite = limite;
	}

	public CuentaLimite(double limite) {// constructor solo parametro limite
		super();
		this.limite = limite;
	}

	public CuentaLimite() {// constructor vacio
		limite = 50;
	}

	@Override
	public void extraer(double cantidad) {
		if (cantidad < limite) {
			super.extraer(cantidad);

		}

	}

	public void ajustarLimite() {
		limite = (obtenerSaldo() / 2);

	}

}
