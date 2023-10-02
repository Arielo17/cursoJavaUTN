package programasYArchivos;

import java.util.Scanner;

public class Ejercicio1c {

	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		
		if (args.length == 4) {
			
			for (int i = 0; i < 3 ; i++) {
				numeros[i] = Integer.parseInt(args[i]);
			}
			
			ordenar(numeros, args[3]);
			
		} else {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese 3 números enteros seguidos de enter");
			for (int i = 0; i < 3; i++) {
				numeros[i] = scanner.nextInt();
			}
			
			System.out.println("Ingrese si quiere ordenarlos de forma ascendente o descendente"
					+ "\n'a' -> ascendente\t'd' -> descendiente");
			scanner.nextLine();
			String opcion = scanner.nextLine();
			scanner.close();
			
			ordenar(numeros, opcion); 
		}
		
	}
	
	public static void ordenar(int[] numeros, String orden) {

 		int aux;
		for (int l = 0; l < numeros.length - 1 ; l++) {
			for (int m = 0; m < numeros.length - 1; m++) {
				if (numeros[m] > numeros[m+1]) {
					aux = numeros[m];
					numeros[m] = numeros[m+1];
					numeros[m+1] = aux;
				}
			}
		}
		
		switch (orden) {
			case "a":
				System.out.println("Ordenados de forma ascendente: ");
				for (int l = 0; l < numeros.length; l++) {
					System.out.println(numeros[l]);
				}
				break;

			case "d":
				System.out.println("Ordenados de forma descendente: ");
				for (int l = numeros.length - 1; l >= 0 ; l--) {
					System.out.println(numeros[l]);
				}	
				break;
				
			default:
				System.out.println("La opción ingresada es incorrecta");
				break;
		}
	}
	
}
