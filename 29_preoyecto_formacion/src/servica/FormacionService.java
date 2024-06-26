package servica;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import main.Alumno;
import main.Curso;

public class FormacionService {
	List<Curso> cursos=new ArrayList<>(List.of(
			new Curso("Java","Programación",120,LocalDate.of(2014, 11, 10),LocalDate.of(2015, 1, 30),List.of(new Alumno("a1",5.6),
					new Alumno("a2",8),new Alumno("a8",6),new Alumno("b7",4))),
			new Curso("Angular","Programación",80,LocalDate.of(2021, 06, 10),LocalDate.of(2021, 9, 8),List.of(new Alumno("r2",3.6),
					new Alumno("a9",7),new Alumno("b4",5))),
			new Curso("HTML y CSS","Web",60,LocalDate.of(2019, 03, 15),LocalDate.of(2019, 5, 30),List.of(new Alumno("r9",4),
					new Alumno("v4",6),new Alumno("h1",3),new Alumno("s9",5),new Alumno("k2",2))),
			new Curso("Oracle","Bases de datos",100,LocalDate.of(2020, 10, 20),LocalDate.of(2021, 2, 12),List.of(new Alumno("s10",9),
					new Alumno("r1",4))),
			new Curso("SQL","Bases de datos",40,LocalDate.of(2018, 02, 06),LocalDate.of(2018, 4, 20),List.of(new Alumno("y6",7),
					new Alumno("u7",2),new Alumno("b8",4),new Alumno("t2",6))),
			new Curso("Python","Programación",90,LocalDate.of(2016, 10, 23),LocalDate.of(2017, 3, 30),List.of(new Alumno("l9",7.6),
					new Alumno("g5",3),new Alumno("n1",8.4),new Alumno("x6",5.9)))
			
			)); 

	    //añade un nuevo curso si no coinciden mismo nombre y fecha de inicio
	
      public void nuevoCurso(Curso curso) {
		
		if(cursos.stream()
		 .anyMatch(c->c.getNombre().equals(curso.getNombre())&&c.getFechaInicio().equals(curso));
				
	}
	


		//precio medio de cursos por temática
    public double precioMedio( String tematica ) {
	return cursos.stream()
			.filter(n->n.getTematica().equalsIgnoreCase(tematica))
			.collect(Collectors.averagingDouble(n->n.getPrecio()));
					
	
}
		 
		//total cursos finalizados antes de determinada fecha
		
		
		//lista de cursos de la temática recibida como parámetro
		 
		//conjunto de tematicas
		 
		//lista de cursos cuyos precios se encuentran entre los dos valores recibidos como parámetros
    
    public List<Curso> listaPorPrecio (double p1, double p2){
		return cursos.stream()
				.filter(c->c.getPrecio()>=p1 && c.getPrecio()<=p2)
				.collect(Collectors.toList());
		
    	
    	
    }
		 
		//lista de cursos cuya duración sea inferior a los meses que se reciben como parámetro
    
    public List<Curso> listaPorFecha (int meses){
    	return cursos.stream()
    			.filter(c->c.getFechaFin().minusMonths(meses).isAfter(null)
    	
    }
		 
		 
		//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor el nombre del curso
		 
		//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor la lista de cursos con dicha duración
		 
		 
		 //tabla con los cursos divididos entre caros y baratos. Caros, los que superen el precio recibido como parámetro
		 //baratos los que no lo superen o lo igualen
		
		 
		 //cadena con los nombres de todos los cursos, separados por una coma
		 
		 
		 // nota media de un curso
		 
		 //lista con los nombres de todos los alumnos
		 
		 //lista de alumnos matriculados en cursos de determinada temática
		 
		 //alumno con mayor nota 
	
	
	
	
	
	
	
	
	//total cursos finalizados antes de determinada fecha
	
	public int cursosFinalizados (LocalDate fecha) {
		return cursos.stream();
		
		
	}
				
	//lista de cursos de la temática recibida como parámetro
	
	public List<Curso> cursosPorTematica(String tematica){
		return cursos.stream()
				;
		
	}
	
		
		
}
