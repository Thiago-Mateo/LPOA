import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		int numero, end;
		System.out.println("Ingrese numeros en la consola. Terminara cuando el numero ingresado sea mayor a 100 y primo.");
		do {
			end = 0;
			numero = numeros.nextInt();
			if(numero >= 100) {
				for(int i = 2; i < numero / 2; i++) {
					if(numero % i == 0) end++;
				}
			} else {
				end++;
			}
		} while(end != 0);
		numeros.close();
	}

}
