package servica;

/*Crear una clase Triangulo que herede Figura. Tendrá dos atributos: base y altura
Crear una clase Circulo que herede Figura. Tendrá una tributo radio. */

public abstract class Figura {
	
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}
  public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
public abstract double area();// Metodo que han de inplementar las hijas. Es una instrucción o patron que han de cumplir con este método bajo las condiciones especificas.
  
  
}
