package vew;

import java.util.Scanner;

import service.Cuenta;

public class MenuCuenta {

	public static void main(String[] args) {
		
		int opcion = 0;

		do {
			presentarMenu();
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			try {

				switch (opcion) {
				case 1:
					
					saldo();
					
					case 2:
						
					ingresar();
						
						
						

				}

			} catch (Exception e) {

				e.printStackTrace();
			}

		} while (opcion != 5);

	}

	public static void presentarMenu() {

		System.out.println("""
				1.- Saldo
				2.- Ingresar
				3.- Extraer
				4.- Movimientos
				5.- Salir
				""");

	}
      public static void saldo() {
    	  Cuenta menu = new Cuenta();
    	  System.out.println(menu.getSaldo());
      }
      
      public static void ingresar() {
    	  Scanner sc = new Scanner(System.in);
    	  Cuenta menu = new Cuenta();
    	  System.out.println("Intoduzca la cantidad a ingresar");
    	  int nuevoSaldo= sc.nextInt();
    	  menu.ingresar(nuevoSaldo);
    	  System.out.println("Su saldo es: "+ );
      }
}
