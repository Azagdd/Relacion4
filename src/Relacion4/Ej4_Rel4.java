//Dado un array de enteros de tamaño N, rotar sus valores una posición a la izquierda, es decir,
//si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el array rotado a la izquierda: -1 -3 15 4 5. 

package Relacion4;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ej4_Rel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos quieres introducir?");
		int num = teclado.nextInt();
		
		int vector [] = new int[num];
		
		System.out.println("Introduce el vector: ");
		FuncionesVectores.pedirVector(vector);
		
		System.out.println();
		FuncionesVectores.RotarIzq(vector);
		
		System.out.println("Los resultados serian: ");
		FuncionesVectores.mostrarVector(vector);
		
		
		
	}

}
