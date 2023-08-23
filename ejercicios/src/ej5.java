import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		//Creo la variable de scanner alumnos
		Scanner alumnos = new Scanner(System.in);
		//Alumno va a toma el valor ingresado en la consola gracias a alumnos
		//loop sirve para realizar un loop infinito en el while
		int alumno, loop = 1;
		//El array a recorrer con el ciclo for-each
		int notas[] = {10,5,6,8,7,4,5,3,4,9};
		System.out.println("Ingrese el numero del alumno cuya nota quiera ver (del 1 al 10) o 0 para ver todas las notas");
		//Inicia el loop infinito donde se pueden ver las notas
		while (loop == 1) {
			//La variable alumno toma el valor dado en consola
			alumno = alumnos.nextInt();
			//Aca se hace un switch para que, segun que haya ingresado el usuario, se muestre la nota de un alumno especifico
			switch(alumno) {
				case 1:
					System.out.println(notas[alumno - 1]);
					break;
				case 2:
					System.out.println(notas[alumno - 1]);
					break;
				case 3:
					System.out.println(notas[alumno - 1]);
					break;
				case 4:
					System.out.println(notas[alumno - 1]);
					break;
				case 5:
					System.out.println(notas[alumno - 1]);
					break;
				case 6:
					System.out.println(notas[alumno - 1]);
					break;
				case 7:
					System.out.println(notas[alumno - 1]);
					break;
				case 8:
					System.out.println(notas[alumno - 1]);
					break;
				case 9:
					System.out.println(notas[alumno - 1]);
					break;
				case 10:
					System.out.println(notas[alumno - 1]);
					break;
					//Si el usuario llegase a poner 0, se utilizaria el ciclo for-each
					//De esta manera se imprimen todas las notas del array sin necesidad de buscar el indice
				case 0:
					for(int nota : notas) {
						System.out.print(nota + ", ");
					}
					break;
				default:
					
			}
		}
		
		alumnos.close();
	}

}
