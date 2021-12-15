package classe_objeto;

public class meuPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		paciente consulta = new paciente ();
		System.out.println("Nome do paciente: " + consulta.nomePaciente("Gumercinda Souza"));
		System.out.println("Idade do paciente: " + consulta.idadePaciente("35 anos"));
		System.out.println("Telefone do paciente: " + consulta.telefonePaciente("115555-5555"));

	}

}
