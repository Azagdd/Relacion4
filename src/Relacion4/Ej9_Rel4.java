// Dado un array de enteros de tamaño N, copiarlo a otro array de igual tamaño pero de 
// forma inversa, es decir, si por ejemplo el array de entrada es: 5 -1 -3 15 4, el resultado 
// debe ser un nuevo array cuyos valores son: 4 15 -3 -1 5.

package Relacion4;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ej9_Rel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos quieres introducir?");
		int num = teclado.nextInt();
	
		int vector [] = new int[num];
		
		System.out.println("Introduce el vector: ");
		FuncionesVectores.pedirVector(vector);
		
		
		
	}

}
