/*Faça um programa que entre com três números e coloque em ordem crescente.*/

package ExerciciosIntroducao;

 	import java.util.Scanner;
 
 		public class OrdemCrescente {

 			public static void main(String[] args) {
 				
 				Scanner read = new Scanner(System.in);
 				
 				int  n1,n2,n3; 
 				
 				 
 				System.out.println("Digite primeiro numero:" );
 				 n1=read.nextInt();
 				 
 				System.out.println("Digite segundo numero:" );
				 n2=read.nextInt();
				 
				System.out.println("Digite terceiro numero:" );
 				 n3=read.nextInt();
 				 
 				 if((n1>n2) && (n2>n3) ) {
 					System.out.println("a ordem e:" +n3 +" " +n2 +" " +n1);
 				 }
 				 
 				 if((n1>n3) && (n3>n2)) {
 					System.out.print("a ordem é:" +n2 +" "+n3 +" " +n1);
 				 }
 				 //funfa
 				 if((n2>n1) && (n1>n3)) {
 					System.out.print("a ordem é:" +n3 +" " +n1 +" " +n2);
 				 }
 				 //funcinaaa
 				 if((n2>n3) && (n3>n1)) {
 					System.out.print("a ordem é:\n" +n1 + " "+n3 +" " +n2);
 				 }
 				 
 				if((n3>n2)&& (n2>n1)) {
 					System.out.println("a ordem é:" +n1 +" " +n2 +" " +n3);
 				 }
 				
 				if((n3>n1)&& (n1>n2)) {
 					System.out.println("a ordem é:" +n2 +" " +n1 +" " +n3);
 				 }
 				
 				
 					
 				 
 	 				 
 				 
 				
 			}		
	
	
}
