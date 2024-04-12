package principal;

import java.util.HashSet;
import java.util.Objects;

 class Ciudad {
	private String nombre;
	private String ciudad;
	private int poblacion;

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Ciudad() {
		super();
	}

	@Override
	public String toString() {
		// return "Ciudad [nombre=" + nombre + ", ciudad=" + ciudad + ", poblacion=" +
		// poblacion + "]"; No le gusa al profe

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(nombre, other.nombre)
				&& poblacion == other.poblacion;
	}

}

public class Test() {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		HashSet<Ciudad> ciudades =new HashSet <Ciudad>();
       
       
       ciudades.add(new Ciudad("ciudadA",20000));
       ciudades.add(new Ciudad("ciudadB",35000));
       ciudades.add(new Ciudad("ciudadA",20000));
       
       for(Ciudad c:Ciudades) {
    	   
    	   System.out.println(c);
       }
       
	}
}
