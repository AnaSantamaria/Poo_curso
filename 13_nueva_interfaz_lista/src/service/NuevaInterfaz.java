package service;

import java.util.ArrayList;
import java.util.List;

/*Crear una subinterfaz de List<Integer>, que añada los siguientes métodos estáticos:

-List<Integer> ofPares(int n). Devuelve una lista con los n primeros numeros pares

-List<Integer> ofPositivos(int ... data). Devuelve una lista solo con los números positivos del grupo de números recibidos como parámetro */

public interface NuevaInterfaz extends List<Integer> {

	static List<Integer> ofPares(int n) {//metodo
		Integer[] result = new Integer[n];//objeto
		int num = 0, cont = 0;//variables
		while (cont < n) {//logica
			result[cont] = num;
			num += 2;
			cont++;
		}
		return List.of(result);
	}

	static List<Integer> ofPositivos(int... data) {//metodo
		var result = new ArrayList<Integer>();//variable ??
		for (int n : data) {//logica
			if (n > 0) {
				result.add(n);
			}
		}
		return result;

	}
}