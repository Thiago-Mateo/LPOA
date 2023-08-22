import java.util.Scanner;


public class ej1 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner (System.in);
		int numero;
		System.out.println("Ingrese numeros del 1 al 100");
		for(int i = 0; i < 100; i++) {
			numero = numeros.nextInt();
			System.out.print(numero);
			System.out.println("");
			if(numero % 2 == 0) {
				System.out.println("Es par");
			}
		}
		numeros.close();
	}

}
