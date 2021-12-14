package vetor_matriz;

import java.util.Scanner;

public class vetor_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leia = new Scanner(System.in);
	int pontos [] = new int [5], maior = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe a pontuação: ");
			pontos [i] = leia.nextInt();
			if (pontos [i] > maior) {
				maior = pontos [i];
			}
		}

		for (int i = 0; i < 5; i++) {
			if (pontos[i] == 4) {
				
			}
		}
		
		System.out.println("A maior pontuação foi: " + maior);
				
	leia.close();	

	}

}
