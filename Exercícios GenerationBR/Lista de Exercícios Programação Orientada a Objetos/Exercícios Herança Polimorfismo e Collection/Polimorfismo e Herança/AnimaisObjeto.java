package POO2;

public class AnimaisObjeto 
{
	public static void main(String[] args)
	{
	Cachorro animal1 = new Cachorro();
	Cavalo animal2 = new Cavalo();
	Preguica animal3 = new Preguica();
	
	
	animal1.setNome("Cachorro: Max");
	System.out.println("Nome: " + animal1.getNome());
	animal1.setIdade(15);
	System.out.println("Idade:" + animal1.getIdade());
	animal1.correr();
	animal1.som("som");
	
	System.out.println();
	
	animal2.setNome("Cavalo: Benny");
	System.out.println("Nome: " + animal2.getNome());
	animal2.setIdade(10);
	System.out.println("Idade:" + animal2.getIdade());
	animal2.correr();
	animal2.som("som");
	
	System.out.println();
	
	animal3.setNome("Preguiça: Maria");
	System.out.println("Nome: " + animal3.getNome());
	animal3.setIdade(4);
	System.out.println("Idade:" + animal3.getIdade());
	animal3.subir();
	animal3.som("som");
	}

}
