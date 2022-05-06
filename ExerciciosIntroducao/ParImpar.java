/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

//como fazer raiz quandrada; como deixar num elevado ao quadrado
package ExerciciosIntroducao;

import java.util.Scanner;
import java.lang.Math;


	public class ParImpar {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int num,result,quad;
		
		
		System.out.println("Inoforme um numero");
		num =read.nextInt();
		
		
		result=num%2;
		num= num*num/2;
		
		if (result==0) {
			
			
			System.out.println("Seu numero e par");
			 System.out.println(Math.sqrt(num));
			
		}
		
		else {
			num= num*num;
			System.out.println("Seu número é ímpar e elevado ao quadrado e:"+num);
		}
		
		
		
		
	}

}
