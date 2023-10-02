package programasYArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2a {

	public static void main(String[] args) {
		try {
			if (args[1].equalsIgnoreCase("s")) {
				int suma = 0;
				for (String linea : Files.readAllLines(Paths.get(args[0]))) {
					suma += Integer.parseInt(linea);
				}
				System.out.println("La suma de los números es: " + suma);
			}
			
			if (args[1].equalsIgnoreCase("m")) {
				int producto = 1;
				for (String linea : Files.readAllLines(Paths.get(args[0]))) {
					producto *= Integer.parseInt(linea);
				}
				System.out.println("El producto de los números es: " + producto);
			}

		} catch (IOException e) {
			System.out.println("No se pudo abrir el archivo");
			e.printStackTrace();
		}

	}
}
