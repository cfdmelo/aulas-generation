package POO;

public class ObjetoAviao 
{
	public static void main(String[] args) 
{
    Aviao aviao1 = new Aviao();
    
    aviao1.setNome("Avi");
	System.out.println("Nome do avião: " + aviao1.getNome());
	aviao1.setCapacidade(20);
	System.out.println("Capacidade: " + aviao1.getCapacidade());
	aviao1.setPeso(100);
	System.out.println("Peso em toneladas: " + aviao1.getPeso());
	aviao1.setTurbina(true);
	aviao1.setVelocidade(300);
	aviao1.decolar();
		
		
		
		
 }
}
