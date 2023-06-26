//Dado un array de enteros de tamaño N, visualizar por pantalla todos los elementos del
//mismo cuyo valor sea menor que un número A.

package Relacion4;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ej2_Rel4 {

	public static void main(String[] args) { //creacion del array
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos quiere introducir?"); // Meter por teclado la cantidad de numeros del array
		int num = teclado.nextInt();
		
		int vector [] = new int[num];	// Declarar el vector = a num, que es lo que nosotros introducimos por teclado y la variable a como int 
		int a;
		
		System.out.println("Introduce el vector: "); // Introducir por teclado el valor del vector, usando el procedimiento creado anteriormente para ello
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Tu vector es: ");	// Se muestra el resultado de los numeros que se introducen anteriormente por teclado 
		FuncionesVectores.mostrarVector(vector); // usando la funcion de mostrar vectores
		
		System.out.println("Introduce el número a comprobar:  "); // Se introduce el numero con el que se quiere comparar para sacar los numeros menores
		a = teclado.nextInt();
		
		System.out.println("Los resultados serian: ");	// Finalmente te entrega el resultado usando para ello la función creada para sacar el numero menor
		FuncionesVectores.MenorQueA(vector, a);
		
	}

}
