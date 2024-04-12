package servica;

public class Circulo extends Figura {
   private int radio;

public Circulo(String color, int radio) {
	super(color);
	this.radio = radio;
}

public Circulo(String color) {
	super(color);
}

public int getRadio() {
	return radio;
}

public void setRadio(int radio) {
	this.radio = radio;
}


public double area() {
	
	
	return Math.PI*radio*radio;
}
   
   
}
