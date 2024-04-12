package principal;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer> {

	private int numero;

	public ListNumber() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Integer first() {

		if (size() == 0) {
			return null;

		}
		return get(0);
	}

	public Integer last() {
    	
    	 
   	 if(size()==0) {
   		 return null;
   		 
   	 }
		
    	
    	return(get(size()-1));
    	
    	
    }

	public int sum() {
		int sum = 0;
		int suma=0;	
		
		for (Integer n : this) {


			suma+= n;
			
		} 
		return suma;


	}

	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
			return super.add(e);
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
