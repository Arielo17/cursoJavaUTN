package programasYArchivos;

import java.util.Scanner;

public class Ejercicio1b {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numeros[] = new int[3];
		
		System.out.println("Ingrese 3 números enteros seguidos de enter");
		for (int i = 0; i < 3; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("Ingrese si quiere ordenarlos de forma ascendente o descendente"
				+ "\n'a' -> ascendente\t'd' -> descendiente");
		scanner.nextLine();
		String opcion = scanner.nextLine();
		scanner.close();
		
		int aux;
		for (int i = 0; i < numeros.length - 1 ; i++) {
			for (int j = 0; j < numeros.length - 1; j++) {
				if (numeros[j] > numeros[j+1]) {
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}
		
		switch (opcion) {
			case "a":
				System.out.println("Ordenados de forma ascendente: ");
				for (int i = 0; i < numeros.length; i++) {
					System.out.println(numeros[i]);
				}
				break;

			case "d":
				System.out.println("Ordenados de forma descendente: ");
				for (int i = numeros.length - 1; i >= 0 ; i--) {
					System.out.println(numeros[i]);
				}	
				break;
				
			default:
				System.out.println("La opción ingresada es incorrecta");
				break;
		}
		
	}
}
