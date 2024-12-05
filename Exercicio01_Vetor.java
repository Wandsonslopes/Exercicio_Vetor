package exercicio_Vetor;

import java.util.Scanner;

public class Exercicio01_Vetor {

	public static void main(String[] args) {

		int numeros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numeroProcurado;
		int indice;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		numeroProcurado = leia.nextInt();
		
		boolean encontrado = false;

        for (indice = 0; indice < 10; indice++) {
            if (numeros[indice] == numeroProcurado) {
                System.out.println("O número " + numeroProcurado + " está localizado na posição: " + indice);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }

        leia.close();

	}

}
