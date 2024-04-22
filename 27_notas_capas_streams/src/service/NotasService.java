package service;

import java.util.ArrayList;
import java.util.Arrays;

public class NotasService {
	ArrayList<Double> notas=new ArrayList<Double>();
	public void agregarNota(double nota) {
		notas.add(nota);
	}
	public double media() {
		return notas.stream()
				.mapToDouble(n->n)
				.average()
				.orElse(0);
				
	
	}
	public double max() {
		return notas.stream()
				.mapToDouble(n->n)
				.average()
				.orElse(0);
		
	}	
	
	public double min() {
		return notas.stream()
				.mapToDouble(n->n)
				.average()
				.orElse(0);
		
	}
	
	public int totalAprobados() {
		return (int) notas.stream()
				.filter(n->n>5)
				.count();
		
		
	}
	public Double[] obtenerNotas() {
		/*double[] todas=new double[notas.size()];
		for(int i=0;i<notas.size();i++) {
			todas[i]=notas.get(i);
		}
		return todas;*/
		return notas.toArray(new Double[0]);
	}
}
