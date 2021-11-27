package br.com.erickfreire.totalparemumvetor;

import java.util.Scanner;

public class TotalPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int indice;
		int pares = 0;
		int A[] = new int[15];
		
		for(indice = 0; indice < 15; indice++) {
			System.out.print("Digite Um Valor: ");
			A[indice] = entrada.nextInt();
			if(A[indice] % 2 == 0)
				pares = pares + 1;			
		}
		
		System.out.printf("O total de valores pares é de: %d", pares);

	}
}
