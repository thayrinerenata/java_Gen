package classe_objeto;

public class meuAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aviao voa = new aviao ();
		System.out.println("Modelo do avi�o: " + voa.modeloAviao("Jatinho Gulfstream IV"));
		System.out.println("Velocidade atingida: " + voa.velocidadeAviao("1136 km"));
		System.out.println("Destino: " + voa.destinoAviao("Canad�"));		

	}

}
