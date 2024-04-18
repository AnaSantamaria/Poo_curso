package service;

import java.util.Date;

public class Director extends Empleado {
private String departamento;
private int personal;

		
	public String getDepartamento() {
	return departamento;
}


public void setDepartamento(String departamento) {
	this.departamento = departamento;
}


public int getPersonal() {
	return personal;
}


public void setPersonal(int personal) {
	this.personal = personal;
}


	public Director(String nombre, int edad, Date fechaIngreso, double salario, String departamento, int personal) {
	super(nombre, edad, fechaIngreso, salario);
	this.departamento = departamento;
	this.personal = personal;
}


	public Director(String nombre, int edad, Date fechaIngreso, double salario) {
	super(nombre, edad, fechaIngreso, salario);
}


	@Override
	public void incentivar() {
		
		
		
		
		
		
	}

}
