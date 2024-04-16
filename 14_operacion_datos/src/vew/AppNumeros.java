package vew;

import java.util.List;

import service.MetodoBoolean;
import service.OperacionesService;

public class AppNumeros implements MetodoBoolean{
	//imprimir por un lado, la suma de los pares
		//y por otro la suma de los positivos
	
	
	@Override
	public boolean test(Integer n) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public class sumaPares implements MetodoBoolean {

		@Override
		public boolean test(Integer n) {
			// TODO Auto-generated method stub
			return n % 2 == 0;
		}
		
		
	}
	
	public class sumaPositivos implements MetodoBoolean{

		@Override
		public boolean test(Integer n) {
			// TODO Auto-generated method stub
			return n>0;
		}
		
		
	}

	public static void main(String[] args) {
		List<Integer> numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
		OperacionesService service=new OperacionesService();
		System.out.println("La suma de los numeros pares es: " + service.sumaCondicion(numeros, new sumaPares()));
		System.out.println("La suma de los numeros positivos es: "+service.sumaCondicion(numeros, new sumaPositivos()));

	}

	


}
