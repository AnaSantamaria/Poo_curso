package curso.io;

//Crear una clase para lectura de datos por teclado. Esa clase, tendrá tres métodos:

//readString()
//readInt()
//readDouble() 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LectorTeclado extends BufferedReader{//clase que hereda de BufferedReader 

	public LectorTeclado(){//constructor
		
		super(new InputStreamReader(System.in));// Inicializa un InputStreamReader
		
	}
	
	public String readString() {//Metodo public tipo String llamado readString
		try {
			return readLine();// me devuelve una linea leida
		} catch (IOException e) {
			
			e.printStackTrace();
			return null; /// Si falla la lectura retornamos null porque el String se inicializa en null
		}
		
	}
	public int readInt() {  //Leer numeros
		
		try {
			return Integer.parseInt(readLine());//"convierte a entero la linea leida
		} catch (IOException e) {
			
			e.printStackTrace();
			return 0; /// Si falla la lectura retornamos 0
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
