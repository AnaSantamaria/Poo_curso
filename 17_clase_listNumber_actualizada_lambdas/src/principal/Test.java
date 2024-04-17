package principal;



class Impares implements Condicion{
	@Override
	public boolean test(Integer n) {
		return n%2!=0;
	}
}
class RaizCuadrada implements Transformacion{

	@Override
	public Integer transformar(Integer n) {
		return (int)Math.sqrt(n);
	}
	
}


public class Test {
	public static void main (String[]args) {
		
			ListNumber lst=new ListNumber();
			lst.add(20);
			lst.add(11);
			lst.add(30);
			lst.add(20);
			lst.add(17);
			
			lst.eliminarNumeros(n->(int)Math.sqrt(n));
			lst.transformarNumeros(n-> n%2!=0);
			
			System.out.println(lst.first());
			System.out.println(lst.last());
			System.out.println(lst.sum());
			
	
	
	}
}
