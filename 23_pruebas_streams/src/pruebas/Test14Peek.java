package pruebas;

import java.util.List;

public class Test14Peek {

	public static void main(String[] args) {
		List<Integer>nums=List.of(11,4,5,2,9,-3,23,4);
		//Muestra numeros y di si hay negativos
		System.out.println("¿hay negativos?: "+ 
		nums.stream()
		.peek(n->System.out.println(n))
		.anyMatch(n->n<0));
		

	}

}
