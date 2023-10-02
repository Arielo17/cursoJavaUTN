package programasYArchivos;

public class Ejercicio1a {

	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		
		for (int i = 0; i < 3 ; i++) {
			numeros[i] = Integer.parseInt(args[i]);
		}

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
		
		switch (args[3]) {
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
