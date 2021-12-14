package javando;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	int idade, mesesidade, anos, meses, dias;
			
	System.out.println("Digite quantos anos você tem: ");
	idade = leia.nextInt();
	System.out.println("Digite quantos meses você tem: ");
	mesesidade = leia.nextInt();
	
	anos = (365 *idade);
	meses = (30 * mesesidade);
	dias = (anos + meses);
			
	System.out.println("Sua idade em dias é: " + dias + " dias.");
	
	leia.close();
		
		}
}
