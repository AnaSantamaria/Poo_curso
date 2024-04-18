package model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public abstract class Empleado {
	
	
		private String nombre;
		private int edad;
	    LocalDate fechaIngreso;//12/01/2013
		private double salario;
		final double bono = 50000;
		
		public abstract void incentivar(); 
		

}
