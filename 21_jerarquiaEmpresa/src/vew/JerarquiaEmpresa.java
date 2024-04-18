package vew;

import java.time.LocalDate;

import service.Director;
import service.Operario;

public class JerarquiaEmpresa {


	public static void main(String[] args) {
		//String nombre, int edad, LocalDate fechaIngreso, double salario, String departamento,
		//int personal
		LocalDate fecha = LocalDate.of(2020, 1, 1);
		LocalDate f2=LocalDate.of(2010, 5, 10);
		Director director= new Director("paula",23,fecha, 29000,"ventas",21);
		director.incentivar();
		System.out.println(director.getSalario());
		//Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivelSeguridad)
		Operario operario = new Operario("Carmen",55,f2,35000,4);
		operario.incentivar();
		System.out.println(operario.getSalario());
	}

}
