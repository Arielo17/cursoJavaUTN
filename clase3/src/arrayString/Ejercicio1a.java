package arrayString;

import java.util.Scanner;

public class Ejercicio1a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra u oración: ");
		String palabra = scanner.nextLine();
		System.out.println("ingrese una letra a buscar: ");
		char letra = scanner.nextLine().charAt(0);
		scanner.close();
		
		int cont = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == letra) {
				cont++;
			}
		}
		
		if (cont>0) {
			System.out.println("Se encontraron " + cont + " letras '" + letra +
					"' en la frase ingresada" );
		} else {
			System.out.println("La letra '" + letra + "' no se encuentra en la frase");
		}

	}

}
