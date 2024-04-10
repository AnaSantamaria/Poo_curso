package curso.io;

//Crear una clase para lectura de datos por teclado. Esa clase, tendrá tres métodos:

//readString()
//readInt()
//readDouble() 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LectorTeclado extends BufferedReader{

	public LectorTeclado(){
		
		super(new InputStreamReader(System.in));
		
	}
	
	public String readString() {
		try {
			return readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
			return null; /// Si falla la lectura retornamos null
		}
		
	}
	public int readInt() {  //Leer numeros
		
		try {
			return Integer.parseInt(readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
			return 0; /// Si falla la lectura retornamos null
		}
		
		
	}
	public double readDouble() {
		
		try {
			return Double.parseDouble(readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
			return 0.0; /// Si falla la lectura retornamos null
		}
		
		
	}

}
