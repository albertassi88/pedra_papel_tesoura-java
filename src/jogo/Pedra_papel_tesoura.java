package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedra_papel_tesoura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		Regras regras = new Regras();
		String[] vetor;

		String palavra_igual = "";
		for (int n = 1; n <= 2; n++) {
			System.out.print("Jogador " + n + ", você escolhe 'pedra', 'papel' ou 'tesoura'?");
			String palavra = sc.nextLine();
			while ((!palavra.equalsIgnoreCase("pedra")) & (!palavra.equalsIgnoreCase("papel"))
					& (!palavra.equalsIgnoreCase("tesoura"))) {
				System.out.print("Palavra Errada! Escreva 'pedra', 'papel' ou 'tesoura'");
				palavra = sc.nextLine();
			}
			while (palavra.equalsIgnoreCase(palavra_igual)) {
				System.out.println("O jogador 1 já escolheu " + palavra_igual.toUpperCase() + "! Escreva outra opção.");
				palavra = sc.nextLine();
				while ((!palavra.equalsIgnoreCase("pedra")) & (!palavra.equalsIgnoreCase("papel"))
						& (!palavra.equalsIgnoreCase("tesoura"))) {
					System.out.print("Palavra Errada! Escreva 'pedra', 'papel' ou 'tesoura'");
					palavra = sc.nextLine();
				}
			}
			palavra_igual = palavra;
			list.add(palavra);
		}

		vetor = list.toArray(new String[0]);
		String palavra1 = vetor[0];
		String palavra2 = vetor[1];

		regras.regras_jogo(palavra1, palavra2);

	}
}
