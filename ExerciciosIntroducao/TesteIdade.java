/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
- 10-14 infantil
- 15-17 juvenil
- 18-25 adulto*/


package ExerciciosIntroducao;
import java.util.Scanner;

	public class TesteIdade {

			public static void main(String[] args) {
				
				Scanner read = new Scanner(System.in);
				
				int  idade;
				
				
				System.out.println("Informe sua idade:" );
				 idade=read.nextInt();
				 
				 if ((idade>10) && (idade<=14)) {
					System.out.println("Voce se encontra na categoria infantil" );
				 }
				 else if ((idade>15) && (idade<=17)) {
					 System.out.println("Voce se encontra na categoria juvenil" );
				}
				 else if ((idade>18) && (idade<=25)) {
					 System.out.println("Voce se encontra na categoria adulto" );
				}
			}
}
