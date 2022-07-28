package POO;

public class ObjetoCliente 
{
	public static void main(String[] args)
	{

	Cliente usuario1 = new Cliente();
	
	System.out.println("Dados dos usuários:");
	System.out.println();
	usuario1.setNome("Camila Freire de Melo");
	System.out.println("Nome: " + usuario1.getNome());
	usuario1.setIdade(28);
	System.out.println("Idade: " + usuario1.getIdade()); 
	usuario1.setAltura(1.65);
	System.out.println("Altura: " + usuario1.getAltura());
	usuario1.setPeso(50);
	System.out.println("Peso: " + usuario1.getPeso());
	usuario1.setExames(true);
	usuario1.exame();
	}
}
