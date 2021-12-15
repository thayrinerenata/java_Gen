package classe_objeto;

public class paciente {
	
	public String nome;
	public String idade;
	public String telefone;
	
	public String nomePaciente (String consulta) {
		nome = consulta;
		return consulta;
	}
	
	public String idadePaciente (String consulta) {
		idade = consulta;
		return consulta;
	}
	
	public String telefonePaciente (String consulta) {
		telefone = consulta;
		return consulta;
	}

}
