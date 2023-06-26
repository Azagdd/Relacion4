// Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores de un 
// espacio N-dimensional, decir si son paralelos o no. Son paralelos si todos sus valores 
// son proporcionales


package Relacion4;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ej7_Rel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos quieres introducir?");
		int num1 = teclado.nextInt();
		
		System.out.println("¿Cuantos elementos quieres introducir?");
		int num2 = teclado.nextInt();
		
		int vector1 [] = new int[num1];
		int vector2 [] = new int[num2];
		
		System.out.println("Introduce el vector1: ");
		FuncionesVectores.pedirVector(vector1);
		
		System.out.println("Introduce el vector2: ");
		FuncionesVectores.pedirVector(vector2);
		
		FuncionesVectores.SonParalelos(vector1, vector2);
		if (FuncionesVectores.SonParalelos(vector1, vector2)) {
			System.out.printf("Son paralelos");
		}	else
				System.out.printf("No son paralelos");
		
	}

}
