package principal;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Prueba1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(25);nums.add(200);nums.add(10);
		System.out.println(sumarPares(nums));
		
	
		
	

	}
//crear un metodo que reciba una lista de Integer y devuelva la suma e los pares de dicha lista
	
	public static int sumarPares  (List<Integer> lista) {
		int pares=0;
		for(Integer s:lista) {
			
			if(s%2==0) {
				
				pares+=s;
			}
		}
		
		return pares;
		
	}
	
	//Crear un metodo que reciba una coleccion de Integer y devuelva la media de los valores de dicha coleccion
	
	public static int media (Collection<Integer> lista) {
		int media=0;
		for (Integer s:lista) {
			
			media+=s;
		}
		
		return media/lista.size();
		
	}
}

