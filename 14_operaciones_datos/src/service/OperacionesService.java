package service;

import java.util.List;

public class OperacionesService {
	//método que recibe una lita de numeros enteros y devuelve la suma de los pares

	public  int suma (List<Integer> lista) {
		int sum=0;
		for(Integer n:lista) {
			if(n%2==0) {
				sum+=n;
			}
			
		}
		
		return sum;
		
		
	}
	//metodo que recibe una lista de numeros enteros y devuelve la suma de los positivos
	
	public int sum2(List<Integer> lista) {
		int sum=0;
		for(Integer n:lista) {
			if(n<=0) {
				
				sum+=n;
			}
			
		}
		
		return sum;
		
		
	}

	//Metodo que recibe una lista de numeros enteros y devuelve la suma de los multiplos de 5
	
	//Metodo que recibe una lista de unumetos y una condición y devuelve la suma de los numeros que cumplen esa condicion
	
	public int sumaPorCondicion(List<Integer> numeros, MetodoBoolean condicion ) {
		int suma=0;
		
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				
				suma+=n;
			}
		
	}
	return suma;

}
}
