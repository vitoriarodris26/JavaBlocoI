/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package ExerciciosIntroducao;

import java.util.Scanner;

public class MaiorValor {


	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int  num1,num2,num3,maior;
		
		// fiz usuário inserir os  números 
		System.out.println("Digite primeiro numero:" );
		 num1=read.nextInt();
		
		 System.out.println("Digite o segundo numero:" );
		 num2=read.nextInt();
		 
		 System.out.println("Digite o terceiro numero:" );
		 num3=read.nextInt();
		 
		 //comparação entre os númros de entrada
		 if ((num1 >num2)&& (num1>num3)) {
			 System.out.println("O numero maior e: " +num1 );
		 }
		 else if ((num2 >num1)&& (num2>num3)) {
			 System.out.println("O numero maior e: " +num2 );
		 }
		 else {
			 System.out.println("O numero maior e: " +num3 );
		 }
		 
		 
		
		
	}

}
