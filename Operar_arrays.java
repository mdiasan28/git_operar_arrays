package entornos;

import Programacion.Utils_arrays;

public class Operar_arrays {

	public static void main(String[] args) {
		int array[] =  Utils_arrays.CrearArrayNumAleatorio(10, 1, 20);
//		MostrarArray(array);
		

	}

	//Utilizaremos los límites necesarios para el ejercicio
	public static int[] CrearArrayNumAleatorio (int longitud, int limiteInf, int limiteSup) {
		int array[] = new int [longitud];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i]= ObtenerNumAlteatorio (limiteInf, limiteSup);
			
		}
		return array;
	}
	
//	public static void MostrarArray (int [] array) {
//		System.out.println("\nContenido del array");
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//			
//		}
//	}
	
	public static int ObtenerNumAlteatorio (int limiteSup, int limiteInf) {
		return (int) Math.round(Math.random()* (limiteSup - limiteInf)) + limiteInf;
	}
}
