package javando;

import java.util.Scanner;

public class idade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int diasidade, anos, meses, dias;
		
		System.out.println("Digite sua idade em dias: ");
		diasidade = leia.nextInt();
		
		anos = (diasidade / 365);
		meses = (diasidade % 365) / 30;
		dias = (diasidade % 365) * 30;
		
		System.out.println("Sua idade é: " + anos + " anos " + meses + " meses " + dias + " dias.");
		
		leia.close();

	}

}
