package laco_repeticao;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, maior = 0, menor = 0;
		
			while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			if(idade < 21 && idade > 0) {
				menor++;
			} 
			
			else if(idade > 50) {
				maior++;
			}
			
		}
			
	System.out.println("Os menores de de 21 anos são: " + menor + " e os maiores de 50 são: " + maior);
	
	leia.close();

	}

}
