package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	int num;
	double media;
	int suma=0;
	int contar;
	Scanner read= new Scanner (System.in);
	System.out.println("Introduzca 10 números para calcular la media: ");
	for (contar=1;contar<=10;contar++) {
		num = read.nextInt();
		suma+=num;
	}
		media=suma/contar;
		System.out.println("La media de los números introducidos es " + media);
	}
	
	}


