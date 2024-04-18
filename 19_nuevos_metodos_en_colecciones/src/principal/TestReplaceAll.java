package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(3,4,5,9,-7,2,-2));
		//Sustituir cada elemento por su mitad
		nums.replaceAll(n->n/0);
		nums.forEach(n->System.out.println(n));

	}

}
