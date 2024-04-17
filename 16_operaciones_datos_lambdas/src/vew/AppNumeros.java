package vew;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Predicate;

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
		List<Integer> numeros = List.of(3, -2, 8, 5, 1, 17, 22, -9, 6, 12);
		// imprimir por un lado, la suma de los pares
		// y por otro la suma de los positivos
		OperacionesService service = new OperacionesService();
		System.out.println("Suma positivos: " + service.sumaPorCondicion(numeros, n -> n > 0));
		System.out.println("Suma pares: " + service.sumaPorCondicion(numeros, n -> n % 2 == 0));
		// suma los negativos mayores que -5
		System.out.println("Suma pares: " + service.sumaPorCondicion(numeros, n -> n > 0 && n > -5));
		Predicate<Integer> negativo = n -> n < 0;
		System.out.println("Otra: " + service.sumaPorCondicion(numeros, negativo.and(n -> n < -5)));

		// imprimir los positivos
		service.procesarPorCodicion(numeros, n -> System.out.println(n), n -> n > 0);// quiero imprimir y quiero que
																						// sean solo los positivos
		// guardar los pares en un fichero
		String ruta = "fichero.txt";
		service.procesarPorCodicion(numeros, n -> {
			FileOutputStream fos;

			try {
				fos = new FileOutputStream(ruta, true);
				PrintStream out = new PrintStream(fos);
				out.println(n);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, n -> n % 2 == 0);
		
		//método que recibe un conjunto de números e imprime los negativos 
		
		service.procesarPorCodicion(numeros,  n -> System.out.println(n), n -> n < 0);

	}
}
