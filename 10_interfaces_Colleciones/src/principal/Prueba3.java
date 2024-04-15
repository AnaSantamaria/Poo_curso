package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Prueba3 {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(25);nums.add(200);nums.add(10);nums.add(12);
		HashSet<Integer> nums2 = new HashSet<Integer>();
		nums2.add(12);nums2.add(30);nums2.add(200);nums2.add(25);
		
	System.out.println(iguales(nums,nums2));
		
		

	}
// Realizar un metodo que recibe 2 collecciones de enteros y devuelve un conjunto con numeros contenidos en ambas colecciones
	
	public static Set<Integer> iguales (Collection<Integer>col1,Collection<Integer>col2) {
		
		Set<Integer> aux = new HashSet<Integer>();
		
	for(Integer n:col1) {
		if(col2.contains(n)){
			aux.add(n);
			
		}
	}
		
		return aux;
		
		
	}
}
