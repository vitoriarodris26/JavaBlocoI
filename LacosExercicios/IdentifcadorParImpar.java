//   2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package LacosExercicios;


import java.util.Scanner;

public class IdentifcadorParImpar {


	public static void main(String[]args) {
		
		int num, par=0,x=0, impar=0;
		
		Scanner read = new Scanner (System.in);
		
		
		for (x=1; x<=10; x++) {
			
			System.out.println("Informe o numero "+ "(" +x +"): ");
			num= read.nextInt();
		

			if (num%2==0) {
			par++; 
		}

			if (num%2==1) {
			impar++;
		}	
			
	}

		System.out.println("par sao pares: " + par);
		System.out.println("par sao impares: " + impar);
			
				

			
	}
	
	
	
}
