/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package LacosExercicios;

import java.util.Scanner;

public class SomaNumDigitados {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
	/************************************/
		int x=0, result=0;
		
		do{
			
			System.out.println("Informe o numero inteiro: (para somar digite zero)");
			x= read.nextInt();


				result=result+x;

			
		}while (x!=0);
		
		System.out.println("A soma dos numeros digitados e:" +result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*************************/

	}

}
