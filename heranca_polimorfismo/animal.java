package heranca_polimorfismo;

public class animal {
	
	public String nome;
	public String idade;
	
	public String nomeAnimal (String vive) {
		nome = vive;
		return vive;
	}
	
	public String idadePaciente (String vive) {
		idade = vive;
		return vive;
	}

}
