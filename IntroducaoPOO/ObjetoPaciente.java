package IntroducaoPOO;

import java.util.*;	

public class ObjetoPaciente {
	
	public static void main (String [] args) {
		
		ModeloPaciente paciente1 = new ModeloPaciente();
		ModeloPaciente paciente2 = new ModeloPaciente();
		
		paciente1.nome= "Lucas Vicente";
		paciente1.idade= 12;
		paciente1.dorosso=true;
		paciente2.remedFreaq=true;
		
		
		paciente1.estadoAtual();
		paciente1.RemedioFrequente();
		paciente1.IdadePaciente();
		paciente1.TipoDor(); 
		
		System.out.println("\n    ");
		System.out.println("******************************");
		System.out.println("\n                           ");
		
		
		paciente2.nome= "Luna Vicente";
		paciente2.idade= 17;
		paciente2.dorosso=false;
		paciente2.remedFreaq=false;
		
		
		paciente2.estadoAtual();
		paciente2.RemedioFrequente();
		paciente2.IdadePaciente();
		paciente2.TipoDor();
		/**/
		
	}
}
