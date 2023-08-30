import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner remplazar = new Scanner(System.in);
		String palabra;
		System.out.println("Ingrese una palabra y se le remplazara todas las 'T' con 'M' ");
		palabra = remplazar.nextLine();
		palabra = palabra.replace('T', 'M');
		remplazar.close();
		System.out.println(palabra);
		return;
		}
	}


