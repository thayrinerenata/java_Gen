package heranca_polimorfismo;

public class testaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cachorro a1 = new cachorro ();
		cavalo b1 = new cavalo ();
		preguica c1 = new preguica ();
		leao d1 = new leao ();
		
		a1.setNome("Bidú");
		a1.setIdade(5);
		a1.setRaca("Scottish Terrier");
		a1.correr();
		a1.som();
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Idade: " + a1.getIdade());
		System.out.println("Raça: " + a1.getRaca());
		
				
	}

}
