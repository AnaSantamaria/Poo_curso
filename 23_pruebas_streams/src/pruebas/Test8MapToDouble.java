package pruebas;

import java.util.List;

public class Test8MapToDouble {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//suma de todos lo numeros negativos
		System.out.println(nums.stream()
		
		.filter(n->n<0)
		.mapToInt(n->n) //se transforma de Integer a int a si mismo
		.sum());
	
//media de los positivos
		nums.stream()
	.filter(n->n>0)
	.distinct()
	.mapToInt(n->n)
	.average()
	.ifPresentOrElse(r->System.out.println(r), ()->System.out.println("no hay media"));
	
	
	
	
	}
}
