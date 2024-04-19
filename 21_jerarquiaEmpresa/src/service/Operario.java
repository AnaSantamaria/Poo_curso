package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Empleado;

public class Operario extends Empleado{
 private int nivelSeguridad;
 
	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivelSeguridad) {
	super(nombre, edad, fechaIngreso, salario);
	this.nivelSeguridad=nivelSeguridad;
}

	public Operario() {
		
	}

	@Override
	public void incentivar() {
		if(this.getEdad()>30 && nivelSeguridad>2){
			setSalario(getSalario()+(getBono() * 2));
		}else if (getEdad()>30 || nivelSeguridad>2) {
			setSalario(getSalario() + ((getBono())));
		}
	}
	
	public void actualizarNivel() {
		long antiguedad= ChronoUnit.YEARS.between(this.getFechaIngreso(), LocalDate.now());
		
		if(antiguedad>2 && antiguedad<5) {
			nivelSeguridad++;
		}
			
		}
	
	
	
}


