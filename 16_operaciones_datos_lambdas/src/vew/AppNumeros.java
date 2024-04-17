package vew;

import java.util.List;

import service.MetodoBoolean;
import service.OperacionesService;

/*class Positivos implements MetodoBoolean{

	@Override
	public boolean test(Integer n) {
		// TODO Auto-generated method stub
		return n>0;
	}
	 
	
}

class Pares implements MetodoBoolean{

	@Override
	public boolean test(Integer n) {
		
		return n%2==0;
	}
	
	
}*/


public class AppNumeros {

	public static void main(String[] args) {
	List<Integer> numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
	//imprimir por un lado, la suma de los pares
	//y por otro la suma de los positivos
	OperacionesService service=new OperacionesService();
	System.out.println("Suma positivos: " + service.sumaPorCondicion(numeros, n->n>0));
	System.out.println("Suma pares: " + service.sumaPorCondicion(numeros,n->n%2==0));
	
	}

}
