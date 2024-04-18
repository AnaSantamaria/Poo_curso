package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import model.Empleado;

@NoArgsConstructor
@AllArgsConstructor
public class Director extends Empleado {

	private String departamento;
	private int personal;

	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario, String departamento,
			int personal) {
		super(nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}

	@Override
	public void incentivar() {

		long mesesDeDiferencia = ChronoUnit.MONTHS.between(this.getFechaIngreso(), LocalDate.now());

		if (mesesDeDiferencia > 30 && personal > 20) {
			this.setSalario(getSalario() + (getBono() * 2));

		} else if (mesesDeDiferencia > 30 || personal > 20);{
			
		
			setSalario(getSalario() + ((getBono())));
			
		} 
		
	}

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

}
