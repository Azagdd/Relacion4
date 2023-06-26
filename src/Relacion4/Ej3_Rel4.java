// Dado un array de reales del tamaño N, 
// visualizar por pantalla todos los elementos 
// del mismo cuyo valor pertenezca al intervalo [a,b). 

package Relacion4;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ej3_Rel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos quieres introducir?");
		int num = teclado.nextInt();
		
		double vector [] = new double[num];
		double a;
		double b;
		
		System.out.println("Introduce el vector: ");
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Tu vector es: ");
		FuncionesVectores.mostrarVector(vector); 
		
		System.out.println("Introduce el primer intervalo:  ");
		a = teclado.nextDouble();
		
		System.out.println("Introduce el segundo intervalo:  ");
		b = teclado.nextDouble();
		
		System.out.println("Los resultados serian: ");
		FuncionesVectores.Intervalo(vector, a, b);
	}

}
