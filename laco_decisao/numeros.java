package javando;
import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
	int num1, num2, num3;
		
	System.out.println("Informe o 1� n�mero: ");
	num1 = leia.nextInt();
		
	System.out.println("Informe o 2� n�mero: ");
	num2 = leia.nextInt();
		
	System.out.println("Informe o 3� n�mero: ");
	num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {			
		System.out.println("O n�mero maior �: " + num1);
		}
		else if(num2 > num3 && num2 > num1) {
		System.out.println("O n�mero maior �: " + num2);
		}
		else if(num3 > num1 && num3 > num2){
		System.out.println("O n�mero maior �: " + num3);
		}
		else {
		System.out.println("N�mero inv�lido!");
		}
	leia.close();

	}

}
