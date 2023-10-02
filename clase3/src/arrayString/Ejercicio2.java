package arrayString;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el mensaje: ");
		String mensaje = scanner.nextLine();
		System.out.println("Elija la opción que prefiere\nc -> Codificar\nd -> Decodificar");
		char opcion = scanner.next().charAt(0);
		scanner.nextLine();
		System.out.print("Ingrese el desplazamiento de codificación: ");
		int desplazamiento = scanner.nextByte();
		scanner.close();

		byte letras[] = mensaje.getBytes();
		int sumaDesplazamiento = 0;

		switch (opcion) {
			case 'c':
				for (int i = 0; i < mensaje.length(); i++) {
					sumaDesplazamiento = letras[i] + desplazamiento;
					if (sumaDesplazamiento > 122) {
						letras[i] = (byte) (sumaDesplazamiento - 26);
					} else {
						letras[i] = (byte) sumaDesplazamiento;
					}
				}
				System.out.println(new String(letras));
				break;
	
			case 'd':
				for (int i = 0; i < mensaje.length(); i++) {
					if (letras[i] < 97) {
						letras[i] -= desplazamiento;
					} else {
						letras[i] -= desplazamiento;
						if (letras[i] < 97) {
							letras[i] += 26;
						}
					}
				}
				System.out.println(new String(letras));
				break;
	
			default:
				System.out.println("Usted ha ingresado una opción inválida");
				break;
		}

	}
}
