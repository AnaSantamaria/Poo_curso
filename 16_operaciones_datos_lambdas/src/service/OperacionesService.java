package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
	
	public int sumaPorCondicion(List<Integer> numeros, Predicate <Integer> condicion ) {
		int suma=0;
		
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				
				suma+=n;
			}
		
	}
	return suma;

}

	//método que recibe una lista de números e imprime los pares
		//método que recibe un conjunto de números y guarda en un fichero los positivos
		//método que recibe una lista y guarda en un fichero los múltiplos de cinco
		//método que recibe un conjunto de números e imprime los negativos 
	
	public void  procesarPorCodicion(Collection<Integer> numeros,Consumer <Integer>operacion,Predicate <Integer>condicion) {
		for(Integer n:numeros) {
			if(condicion.test(n)){
				operacion.accept(n);
			}
			
			
		}
		
		
	}
}
	
	
