/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)  */

package LacosExercicios;
import java.util.Scanner;

public class IdadesTotal {

	
	
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int idade=0, cont21=0, cont50=0;
		/***************************************/
		while (idade!=-99) {
			System.out.println("Informe sua idade: (Para encerrar escreva -99) ");
			idade= read.nextInt();
			
			
			
			if ((idade<21 ) && (idade>0)){
				
				cont21++;
			}
			if (idade>50) {
				
				cont50++;
				 
				
			}
		}
		
		
		System.out.println("O total de pessoas com menos de 21 anos e: "+ cont21);
		System.out.println("O total de pessoas com mais de 50 anos e: "+ cont50);
		
		
		}
		
		
		
		

	
	

}