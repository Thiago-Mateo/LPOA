import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner ingresar = new Scanner(System.in);
		String palabra, palabraLarga = null;
		int longitud = 0;
		System.out.println("Ingrese 5 palabras");
		for(int i = 0; i < 5; i++) {
			palabra = ingresar.nextLine();
			if(palabra.length() > longitud) {
				longitud = palabra.length();
				palabraLarga = palabra;
			} else {}
		}
		System.out.println("La palabra mas larga es " + palabraLarga);
		ingresar.close();
		return;
	}

}
