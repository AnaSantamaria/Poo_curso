package service;


import java.time.LocalDateTime;
import java.util.ArrayList;

/*Clase CuentaMovimientos
Clase que hereda CuentaLimite. Incopora un nuevo método obtenerMovimientos
que devolverá un ArraList con los movimientos realizados
en la cuenta
Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción)   */

import java.util.Date;

public class Movimiento{

	private LocalDateTime fecha;
	String tipoDeMovimiento;
	private double contidad;
	
	
	public Movimiento(double limite, double saldo, LocalDateTime fecha, String tipoDeMovimiento, double contidad) {
		super();
		this.fecha = fecha;
		this.tipoDeMovimiento = tipoDeMovimiento;
		this.contidad = contidad;
	}
	
	


	public Movimiento() {
		super();
	}




	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public String getTipoDeMovimiento() {
		return tipoDeMovimiento;
	}


	public void setTipoDeMovimiento(String tipoDeMovimiento) {
		this.tipoDeMovimiento = tipoDeMovimiento;
	}


	public double getContidad() {
		return contidad;
	}


	public void setContidad(double contidad) {
		this.contidad = contidad;
	}


	
	

	

	
	
	
}
	
	
	
	 
	

