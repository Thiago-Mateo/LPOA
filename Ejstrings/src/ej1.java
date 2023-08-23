import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner nombres = new Scanner(System.in);
		String nombre;
		System.out.print("Ingrese su nombre");	
		nombre = nombres.nextLine();
		System.out.print(nombre);
		nombres.close();
	}

}
