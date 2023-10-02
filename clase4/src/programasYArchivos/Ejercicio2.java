package programasYArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int suma = 0;
		
		try {
			for (String linea : Files.readAllLines(Paths.get(args[0]))) {
				suma += Integer.parseInt(linea);
			}
		} catch (IOException e) {
			System.out.println("No se pudo abrir el archivo");
			e.printStackTrace();
		}
		
		System.out.println("La suma de los números es: " + suma);
	}
}
