package principal;

import java.util.stream.Stream;

public class Primitiva {
	
	//realizar un programa que muestre la conmbinacion ganadora 
	//de la primitiva(6 numeros aleatorios no repetidos entre 1 y 49)
	

	public static void main(String[] args) {
		Stream.generate(()->(int)(Math.random()*49+1))// cast a int porque el Math.random devuelve a Double.
		.distinct()//quita duplicados
		.limit(6)//limta a 6
		.sorted()
		.forEach(n->System.out.println(n));

	}

}
