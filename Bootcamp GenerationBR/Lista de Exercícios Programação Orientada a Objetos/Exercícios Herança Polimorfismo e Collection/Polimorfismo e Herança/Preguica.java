package POO2;

public class Preguica extends Animal
{
	public void subir()
	{
		System.out.println("Subindo em árvores...");
	}

	@Override
	void som(String emitirSom)
	{
		System.out.println("Ow...ow..");
	}
}

