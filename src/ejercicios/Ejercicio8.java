package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int nota;
		int suspenso;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca la nota de los alumnos: ");
		nota=read.nextInt();
		if(nota<=10) {
		for (suspenso=0; nota<5;suspenso++) {
		}
			System.out.println("Hay " + suspenso + " suspensos.");
		}
	}
}

