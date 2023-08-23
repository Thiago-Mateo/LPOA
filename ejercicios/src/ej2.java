import java.util.Scanner;

public class ej2 {
//Arreglar
	public static void main(String[] args) {
		System.out.println("Ingresar los numeros del 50 al 100");
		Scanner numeros = new Scanner(System.in);
		int numero;
		boolean primo = false;
		do {
			numero = numeros.nextInt();
			if(numero < 50 || numero > 100) {
				System.out.println("Ingresar los numeros del 50 al 100");
			} for(int div = 2; div < numero / 2; div++) {
				if(numero % div == 0) {
					primo = true;
			}	
			}
			System.out.print(numero);
			System.out.println("");
			if(primo == true) {
				System.out.println("El numero es primo");
			}
		} while(numero < 100);
	}

}
