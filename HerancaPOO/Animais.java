/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/


package HerancaPOO;

public class Animais {
		
	public String nome;
	public int idade;
	public boolean som= true;
	public boolean corre= true;
	
	public void som () {
		
		if (this.som==false) 
			System.out.println("Está errado, o animal faz som");
		}
		
		
		public void estadoAnimal()
		{
			
		System.out.println("NOME: "+ this.nome);
		System.out.println("IDADE: "+ this.idade);
		System.out.println("Faz som ");
		
		
		
	}
	

	
	
}
