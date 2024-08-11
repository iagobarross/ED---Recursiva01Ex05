package view;

import controller.ControllerFracao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ControllerFracao contFracao = new ControllerFracao();
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		double soma = contFracao.somaFracao(numero);
		System.out.println("A soma recursiva das frações é: " + soma);
	}

}
