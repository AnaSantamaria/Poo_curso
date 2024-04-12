package service;

import java.util.ArrayList;

public class CuentaMovimiento extends CuentaLimite {
	
	class cuentaMovimientos extends CuentaLimite{
		private ArrayList<Movimiento> movimientos = new ArrayList<>();

		public cuentaMovimientos(double limite, double saldo, ArrayList<Movimiento> movimientos) {
			super(limite, saldo);
			this.movimientos = movimientos;
		}
		
		public ArrayList<Movimiento> obtenerMovimientos () {
			return movimientos;
			
			
		}

		@Override
		public void extraer(double cantidad) {
			 ArrayList<Movimiento> mov = new ArrayList<>(cantidad, LocalDateTime.now());
			
			super.extraer(cantidad);
			
			mov.addAll(movimientos);
			 
		}

}

}