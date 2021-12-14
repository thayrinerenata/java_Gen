package vetor_matriz;

import java.util.Scanner;

public class dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leia = new Scanner(System.in);
	int dado [] = new int [10], soma = 0, maior = 0, media = 0, i, contador = 0;
	
		for (i = 0; i <10; i++) {
			System.out.println("Informe o valor do dado: ");
			dado [i] = leia.nextInt();
			
			soma = soma + dado [i];
			media = soma / 10;
			
			if (dado [i] > maior) {
				maior = dado [i];
			}
		}
		
		for (i = 0; i < dado.length; i++) {
			if (dado [i] == maior) {
				contador++;
			}
		}
	
	System.out.println("");
	
	leia.close();

	}

}
