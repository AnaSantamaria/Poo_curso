package principal;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveIf {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(3,4,5,9,-7,2,-2));// no se puede hacercon un List.of directamente ya que List.Of genera una lista inmutable
		nums.removeIf(n->n<0);
		nums.forEach(n->System.out.println(n));

	}

}
