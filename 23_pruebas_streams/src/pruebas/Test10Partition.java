package pruebas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10Partition {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
	
//crear tabla donde esten eagrupados los negativos por un lado y los positivo por otro
	Map<Boolean,List<Integer>> tabla=
		nums.stream()
		.collect(Collectors.partitioningBy(t->t<0)
				);
	//Collector<T,?,Integer> summingInt(ToIntFunction<? super T> mapper)
	
	Map<Boolean,Integer> tablaSumas=
			nums.stream()
			.collect(Collectors.partitioningBy(t->t<0,Collectors.summingInt(t->t))
			);
	
	
	
	}
	 
	
			
			
			
}
