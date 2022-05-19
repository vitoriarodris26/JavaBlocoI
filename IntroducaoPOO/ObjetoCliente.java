package IntroducaoPOO;

import java.util.Scanner;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		
	ModeloCliente cliente1 = new ModeloCliente();
	ModeloCliente cliente2 = new ModeloCliente();
	Scanner read = new Scanner (System.in);
	
	//CLIENTE 1
		
		cliente1.nome= "Vitoria Rodrigues";
		cliente1.idade=19;
		cliente1.genero= "Feminino";
		
		
		cliente1.estadoAtual();
		cliente1.acesso();		
		
	//CLIENTE 2
		cliente2.nome= "Thiago Alves";
		cliente2.idade=17;
		cliente2.genero= "Masculino";
		
		
		cliente2.estadoAtual();
		cliente2.acesso();	
		//
		
		
		
		
		
		
		
		
		

	}

}
