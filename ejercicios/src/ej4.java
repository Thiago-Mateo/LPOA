import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		int opt;
		double res, num1, num2;
		System.out.println("Ingrese dos numeros con los que quiera realizar una operacion aritmetica.");
		num1 = numeros.nextInt();
		num2 = numeros.nextInt();
		System.out.println("Ingrese 1 para sumar, 2 para restar, 3 para multiplicar o 4 para dividir");
		opt = numeros.nextInt();
		switch(opt) {
			case 1:
				res = num1 + num2;
				System.out.print("El resultado da" + res);
				break;
			case 2:
				res = num1 - num2;
				System.out.print("El resultado da" + res);
				break;
			case 3:
				res = num1 * num2;
				System.out.print("El resultado da" + res);
				break;
			case 4:
				res = num1 / num2;
				System.out.print("El resultado da" + res);
				break;
			default:
				
		}
		numeros.close();
	}

}
