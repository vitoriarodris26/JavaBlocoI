package IntroducaoPOO;

public class ModeloPaciente {
	
	//ATRIBUTOS
		String nome;
		int idade;
		boolean remedFreaq=true;
		boolean dorosso;
		
	
		public void IdadePaciente()
		{
			if (this.idade<=15) {
				System.out.println("\nPediatria");
			}
			else {
				System.out.println("\nClinico");
			}	
		}
		
		public void RemedioFrequente () {
			
			if (this.remedFreaq==true) {
				System.out.println("Toma remedio controlado");
			}
			else {
				System.out.println("Nao toma remedio controlado");
		}
	}
			public void TipoDor () {
				
				if (this.dorosso==true) {
					System.out.println("Especialidade: Ortopedia");
				
				}else {
					System.out.println("Especialidade: Clinico Geral");
					
			}
				
		}
				public void estadoAtual(){
					System.out.println("NOME:"+ this.nome);
					System.out.println("IDADE:"+this.idade);
					
				
			
		}
	

}
