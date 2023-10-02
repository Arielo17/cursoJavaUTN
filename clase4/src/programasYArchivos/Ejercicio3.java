package programasYArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio3 {

	public static void main(String[] args) {

		String opcion = args[0];
		int desplazamiento = Integer.parseInt(args[1]);
		Path archivoEntrada = Paths.get(args[2]);
		Path archivoSalida = Paths.get(args[3]);

		if(Files.exists(archivoEntrada)) {
			try {
				String mensaje = Files.readString(archivoEntrada);

				byte[] letras = mensaje.getBytes();
				int sumaDesplazamiento = 0;
				switch (opcion) {
				case "c":
					for (int i = 0; i < mensaje.length(); i++) {
						sumaDesplazamiento = letras[i] + desplazamiento;
						if (sumaDesplazamiento > 122) {
							letras[i] = (byte) (sumaDesplazamiento - 26);
						} else {
							letras[i] = (byte) sumaDesplazamiento;
						}
					}
					break;

				case "d":
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
					break;

				default:
					System.out.println("Usted ha ingresado una opción inválida"
							+ "\nDebe ingresar 'c' o 'd'");
					break;
				}

				if (Files.exists(archivoSalida)) {
					Files.writeString(archivoSalida, new String(letras));
					System.out.println("El archivo se escribió correctamente!!");
				} else {
					System.out.println("No se encontro el archivo de salida");
				}
				
			} catch (IOException e) {
				System.out.println("El archivo ingresado no se pudo leer");
				e.printStackTrace();
			}
			
		} else {
			System.out.println("No se encontró el archivo de entrada");
		}
		
	}

}
