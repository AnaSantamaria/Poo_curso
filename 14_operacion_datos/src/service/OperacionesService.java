package service;

import java.util.List;

public class OperacionesService {
	// método que recibe una lista de numeros enteros y devuelve la suma de los
	// pares

	public int sumaPares(List<Integer> numeros) {
		int sum = 0;

		for (Integer n : numeros) {
			if (n % 2 == 0) {
				sum += n;
			}

		}
		return sum;
	}

	// metodo que recibe una lista de numeros enteros y devuelve la suma de los
	// positivos

	public int sumaPositivos(List<Integer> numeros) {
		int sum = 0;

		for (Integer n : numeros) {
			if (n > 0) {
				sum += n;
			}
		}
		return sum;
	}
	
	//Metodo que recibe una lista de numeros y una condición y devuelve la suma de los numeros que cumplen esa condicion
	
	public int sumaCondicion (List<Integer> numeros,MetodoBoolean condicion) {
		int sum=0;
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				sum+=n;
				
			}
		}
		
		return sum;
		
		
	}
}
