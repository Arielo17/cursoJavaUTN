package introduccionAlgoritmosYJava;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");
		int a = scanner.nextInt();
		System.out.println("Ingrese el segundo número (mayor al primero): ");
		int b = scanner.nextInt();

		// a)
		int i = a;
		while (i <= b) {
			System.out.print(i + " ");
			i++;
		}

		// b)
		int j = a;
		System.out.println("\n\nMostramos solo los pares:");
		while (j <= b) {
			if (j % 2 == 0) {
				System.out.print(j + " ");
			}
			j++;
		}

		// c)
		System.out.println("\n\nIngrese 1 si quiere ver sólo los impares " + "o 2 si quiere ver sólo los pares");
		int opcion = scanner.nextInt();
		int k = a;
		switch (opcion) {
			case 1:
				System.out.println("\nImpares:");
				while (k <= b) {
					if (k % 2 != 0) {
						System.out.print(k + " ");
					}
					k++;
				}
				break;
	
			case 2:
				System.out.println("\nPares:");
				while (k <= b) {
					if (k % 2 == 0) {
						System.out.print(k + " ");
					}
					k++;
				}
				break;
			default:
				System.out.println("El número ingresado no es 1 ni 2");
				break;
		}
		
		// d)
		System.out.println("\n\nPares de atrás hacia adelante");
		for (int l = b; l > a; l--) {
			if (l % 2 == 0) {
				System.out.print(l + " ");
			}
		}
		scanner.close();
	}

}
