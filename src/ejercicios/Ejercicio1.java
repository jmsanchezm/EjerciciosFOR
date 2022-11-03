package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca un número:");
		num= read.nextInt();
		System.out.println("Los números que llegan hasta el número introducido son: ");
		for (int recuento=1;recuento<=num; recuento ++) {
			System.out.println(recuento);
		}
		read.close();


	}

}
