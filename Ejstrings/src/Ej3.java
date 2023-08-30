import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int longitud = 0;
		Scanner ingresar = new Scanner(System.in);
		String palin;
		System.out.print("Ingresa una palabra y te digo si es palindromo");
		palin = ingresar.nextLine();
		longitud = palin.length();
		for(int i = 0; i < longitud / 2; i++) {
			if(palin.charAt(i) == palin.charAt(longitud-1-i)) {
				} else {
				System.out.print("No es palindromo");
				return;
			}
			
		}
		ingresar.close();
		System.out.print("La palabra es palindromo");
		return;
	}

}