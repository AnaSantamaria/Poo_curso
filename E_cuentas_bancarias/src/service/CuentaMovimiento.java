package service;

import java.util.ArrayList;

public class CuentaMovimiento {
	
	class cuentaMovimientos extends CuentaLimite{
		private ArrayList<Movimiento> movimientos = new ArrayList<>();

		public cuentaMovimientos(double limite, double saldo, ArrayList<Movimiento> movimientos) {
			super(limite, saldo);
			this.movimientos = movimientos;
		}
		
		public ArrayList<Movimiento> obtenerMovimientos () {
			
			movimientos.add();
			
			return ArrayList<Movimiento> ;
		}

}

}