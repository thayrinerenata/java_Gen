package javando;

import java.util.Scanner;

public class evento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int evento, horas, minutos, segundos;
		
		System.out.println("Informe quantos segundos durou o evento: ");
		evento = leia.nextInt();
		
		horas = (evento / 3600);
		minutos = (evento % 3600) / 60;
		segundos = (evento % 3600) % 60;
		
		System.out.println("O evento durou: " + horas + " horas " + minutos + " minutos e " + segundos + " segundos.");
		
		leia.close();

	}

}
