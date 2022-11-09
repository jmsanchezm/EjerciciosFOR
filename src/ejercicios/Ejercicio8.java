package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int nota;
		
		int suspenso=0;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca la nota de los alumnos: ");
			for (int i=1 ; i<=5; i++) {
				nota=read.nextInt();
				if(nota<5) {
					suspenso++;
				}
			}
				System.out.println("El número de suspensos es " + suspenso + ".");	
			
		}
			
	}


