package HerancaPOO;

public class MostraAnimais {

	public static void main(String[] args) {
		
		Animais anim = new Animais();
        Cachorro dog = new Cachorro();
        Cavalo caval = new Cavalo();
        Prequica prig = new Prequica();
        
        dog.nome="Junior";
        dog.idade=10;
        dog.som=true;
        dog.corre=true;
        
        dog.estadoAnimal();
        dog.CachorroCorre();
        
        System.out.println("\n*************************");
        
        System.out.println("                            ");
       /**********************************************/
        
        caval.nome="Emilia";
        caval.idade=14;
        caval.som=true;
        caval.corre=true;
        
        caval.estadoAnimal();
        caval.cavaloCorre();
        
System.out.println("\n*************************");
        
        System.out.println("                            ");
       /**********************************************/
        
        prig.nome="Soninho";
        prig.idade=12;
        prig.som=true;
       prig.corre=false;
        
        prig.estadoAnimal();
       prig.PrigSob();
        
        
        
        
        
        

	}

}
