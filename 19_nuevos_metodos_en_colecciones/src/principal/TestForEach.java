package principal;

import java.util.List;

public class TestForEach {

	public static void main(String[] args) {
		
		List<Integer> nums=List.of(3,18,9);
		/*for(Integer n:nums) {
			System.out.println(n);
		}*/
		nums.forEach(n->System.out.println(n));
		

	}
		
	}


