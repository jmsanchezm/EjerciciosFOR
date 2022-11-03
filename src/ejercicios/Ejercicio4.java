package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numUs;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca un número:");
		numUs=read.nextInt();
		for (int num=3;num<=numUs; num+=3 ) {
			System.out.println(num);
		}
	}

}
