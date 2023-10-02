package introduccionAlgoritmosYJava;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresos mensuales totales del hogar?: ");
		int ingresos = scanner.nextInt();
		System.out.println("Cantidad de vehiculos con antiguedad menor a 5 años?: ");
		int cantVehiculos = scanner.nextInt();
		System.out.println("Cantidad de inmuebles?: ");
		int cantInmuebles = scanner.nextInt();
		System.out.println("Posee embarcación, aeronave de lujo o es titular de activos societarios?(true/false): ");
		boolean capacidadEconomica = scanner.nextBoolean();
		
		if(ingresos >= 489083 || cantVehiculos >= 3 || cantInmuebles >= 3 || capacidadEconomica) {
			System.out.println("Pertenece al segmento de ingresos altos");
		} else {
			System.out.println("No pertenece al segmento de ingresos altos");
		}
		
		scanner.close();
	}
}
