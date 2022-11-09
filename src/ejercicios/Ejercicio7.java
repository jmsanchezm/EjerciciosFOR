package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int num;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca un número para calcular su factorial: ");
		num=read.nextInt();
		for (int i =num-1;i>0;i--){
			
			num*=i;

		}
		System.out.println("El número factorial es " + num);
	}
}
