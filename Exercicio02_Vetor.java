package exercicio_Vetor;

import java.util.Scanner;

public class Exercicio02_Vetor {

	public static void main(String[] args) {

		int numero[] = new int[10];

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros:");
		for (int i = 0; i < 10; i++) {
			numero[i] = leia.nextInt();
		}

		System.out.println("\nElementos nos índices ímpares:");
		for (int i = 1; i < 10; i++) {
			if (numero[i] % 2 != 0)
				System.out.println("Índice " + i + ": " + numero[i]);
		}

		System.out.println("\nElementos que são números pares:");
		for (int i = 0; i < 10; i++) {
			if (numero[i] % 2 == 0) {
				System.out.println("Índice " + i + ": " + numero[i]);
			}
		}

		int soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += numero[i];
		}
		System.out.println("\nSoma: " + soma);

		double media = soma / 10.0;
		System.out.println("\nMédia: " + media);

		leia.close();

	}

}
