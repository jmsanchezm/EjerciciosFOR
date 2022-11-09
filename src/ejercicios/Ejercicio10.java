package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca un valor para A: ");
		a=read.nextInt();
		System.out.println("Introduzca un valor para B, mayor a A: ");
		b=read.nextInt();
		for (int contador= a; contador<=b; contador++) {
			System.out.println(contador);
		}
		}
	}



