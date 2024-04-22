package pruebas;

import java.util.List;

public class Test7Maps {

	public static void main(String[] args) {
		List<String> cads=List.of("cadena","otra","fin","sale","casa","sale","paraiso");
		
		//Muestra las longitudes de todas las cadens sin repetir longitudes
		
		cads.stream()
		.map(n->n.length())//Stream<Integer>
		.distinct()
		.forEach(System.out::println);
	}

}
