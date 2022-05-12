/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


package IntroducaoPOO;

public class ModeloCliente {
	
	//ATRIBUTOS
	String nome;
	int idade;
	String genero;
	int login;
	
	
	//MÉTODOS
	public void acesso()
	{
		if (this.idade>=18) {
			System.out.println("\nAcesso liberado!");
		}
		else {
			System.out.println("\nAcesso nao liberado");
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void estadoAtual(){
		System.out.println("Seu nome e: "+ this.nome);
		System.out.println("Seu idade e: "+ this.idade);
		System.out.println("Seu genero e: "+ this.genero);
		
		
		
	}
	
	
}
