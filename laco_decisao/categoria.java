package laco_decisao;

import java.util.Scanner;

public class categoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {			
			System.out.println("Você pertence a categoria infantil!");
			}
			else if(idade >= 15 && idade <= 17) {
			System.out.println("Você pertence a categoria juvenil!");
			}
			else if(idade >= 18 && idade >= 25){
			System.out.println("Você pertence a categoria adulto!");
			}
			
		leia.close();

	}

}
