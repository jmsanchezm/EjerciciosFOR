package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int num;
		int suma=0;
		double media;
		int recuento;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca un número");
		num=read.nextInt();
		for (int i =1; i>=10;i++) {
			suma+=num;
			i=recuento;
		}
		media=suma/recuento;
		System.out.println("La media de los números introducidos es " + media);
	}
}

