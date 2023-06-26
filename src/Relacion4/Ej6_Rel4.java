//	Dado un array de enteros de tamaño N, se debe buscar el primer elemento del array 
//	mayor que un número A, y a partir de él inclusive, visualizar todos los valores de los 
//	siguientes hasta el último elemento del array

package Relacion4;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ej6_Rel4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos quieres introducir?");
		int num = teclado.nextInt();
		
		int vector [] = new int[num];
		int a;
		
		System.out.println("Introduce el vector: ");
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Introduce el número a:  ");
		a = teclado.nextInt();
		
		System.out.println("Los datos son : ");
		FuncionesVectores.mayoravisualizar(vector, a);
		
	}
}