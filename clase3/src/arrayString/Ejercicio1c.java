package arrayString;

import java.util.Scanner;

public class Ejercicio1c {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numeros = {15, 161, 146, 68, 27, 38, 84};
		
		System.out.println("Dado el vector [15 161 146 68 27 38 84]"
				+ " ingrese un número para sumar todos los números del vector"
				+ " mayores al ingresado");
		int ingreso = scanner.nextInt();
		scanner.close();
		
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > ingreso) {
				suma += numeros[i];
			}
		}
		
		System.out.println("La suma es: " + suma);
	}
}
