package pruebas;

import java.util.List;

public class Test3Limit {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//Imprimir los cinco primeros numeros
		nums.stream()////Hace el Objeto stream
		.distinct()
		.limit(5)
		.forEach(n->System.out.println(n));
	}

}
