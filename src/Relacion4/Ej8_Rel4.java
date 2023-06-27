// Dado un array de enteros de tamaño N, decir si es capicúa o no, es decir, si por   
// ejemplo el array es: 5 2 1 2 5, el resultado debe ser “verdad”(se debe tener en cuenta 
// que el tamaño el array puede ser par o impar)

package Relacion4;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ej8_Rel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos quieres introducir?");
		int num = teclado.nextInt();
		
		int vector [] = new int[num];	
		
		System.out.println("Introduce el vector: ");
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Tu vector es : ");
		FuncionesVectores.mostrarVector(vector);

				System.out.printf("No es capicua");

	}

}
