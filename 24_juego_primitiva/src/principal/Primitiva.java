package principal;

import java.util.stream.Stream;

public class Primitiva {
	
	//realizar un programa que muestre la con

	public static void main(String[] args) {
		Stream.generate(()->(int)(Math.random()*49+1))// cast a int porque el Math.random devuelve a Double.
		.distinct()//quita duplicados
		.limit(6)//limta a 6
		.forEach(n->System.out.println(n));

	}

}
