import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner ingresar = new Scanner(System.in);
		String palabra1, palabra2;
		int anagrama = 0;
		System.out.println("Ingrese dos palabras de la misma longitud");
		palabra1 = ingresar.nextLine();
		palabra2 = ingresar.nextLine();
		if(palabra1.length() == palabra2.length()) {
			for(int i = 0; i < palabra1.length(); i++) {
				for(int j = 0; j < palabra2.length(); j++) {
					if(palabra1.charAt(i) == palabra2.charAt(j)) {
						anagrama++;
						break;
					} else {}
				}
				
			}
			if(anagrama == palabra1.length()) {
				System.out.println("Las palabras son anagramas");
				return;
			} else {
				System.out.println("Las palabras no son anagramas");
				return;
			}
		} else {
			System.out.println("Las palabras que ingresaste no son de la misma longitud");
			return;
		}
	}

}
