package ejercicios;

import java.util.Scanner;

public class Ejercicios9 {

	public static void main(String[] args) {
		int num;
		boolean esPrimo= true;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca un número entero positivo: ");
		num=read.nextInt();
		if(num>0) {
			for(int i=2; i<num; i++) {
				if (num%1==0) {
					esPrimo=false;
					break;
				}
			}
			System.out.println(esPrimo ? "Es primo.":"No es primo." );
		}else {
			System.out.println("No se ha introducido un entero positivo.");
		}

	}

}
