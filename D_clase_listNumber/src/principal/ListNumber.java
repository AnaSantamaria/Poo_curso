package principal;

import java.util.ArrayList;
import java.util.Iterator;

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

		if (size() == 0) {
			return null;

		}

		return (get(size() - 1));

	}

	public int sum() {
		int sum = 0;
		int suma = 0;

		for (Integer n : this) {

			suma += n;

		}
		return suma;

	}

	@Override
	public boolean add(Integer e) {
		if (!contains(e)) {
			return super.add(e);

		}
		return false;
	}

	/// public void eliminarNumeros(Condicion condicion) {
	// for (Integer n : this) {
	// if(condicion.test(n)) {
	// remove(n);
	// }
	// }

	// }

	Iterator<Integer> it=iterator();
	while(it.hasNext()) {
		if(condicion.test(it.next())){
			it.remove();
		}
	}



	// metodo para transformar cada numero de la lista en otro.
	// Deberia ser capaz de transformar cada numero en su cuadrado, en la mitad, en
	// su raiz cubica.....

	// nuevo metodo eliminarNumeros:elimina los numeros de la lista que cumplan una
	// condicion
	
	public void transformarNumeos(Transformacion tx) {
		for(int i=0;i<size();i++) {
			set(i,tx.transformar(get(i)));
			
			
		}
		
	}
	
	
	}
	
	

