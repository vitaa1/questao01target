package application;

import java.util.Scanner;

import entities.Sequencia;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Sequencia.sequenciaFibonnaci(n);

		sc.close();
	}
}
