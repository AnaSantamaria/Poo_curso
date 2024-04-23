package pruebas;

import java.util.List;

public class Test13Peek {
	//muestra cada numero de la lista y el total de numeros existentes, sin comtar duplicados //.distinct()

	public static void main(String[] args) {
		List<Integer>nums=List.of(11,4,5,2,9,23,4);
		nums.stream()
		.peek(n->System.out.println(n))
		.count());
		
		
	}

}
