package servica;

public class Tiangulo extends Figura {
	private int base;
	private int altura;

	public Tiangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public Tiangulo(String color) {
		super(color);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double area() {
		int area;

		return ((base * altura) / 2);

	}
}
