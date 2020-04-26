package jogo;

public class Regras {

	public String regras_jogo(String palavra1, String palavra2) {
		String ganhador = "";
		if ((palavra1.equals("papel") & palavra2.equalsIgnoreCase("pedra"))
				| (palavra1.equals("pedra") & palavra2.equalsIgnoreCase("tesoura"))
				| (palavra1.equals("tesoura") & palavra2.equalsIgnoreCase("papel"))) {
			ganhador = palavra1;
			System.out.println("O Jogador 1 ganhou!");
		} else if ((palavra1.equals("papel") & palavra2.equalsIgnoreCase("tesoura"))
				| (palavra1.equals("pedra") & palavra2.equalsIgnoreCase("papel"))
				| (palavra1.equals("tesoura") & palavra2.equalsIgnoreCase("pedra"))) {
			{
				ganhador = palavra2;
				System.out.println("O Jogador 2 ganhou!");
			}
		}
		return ganhador;
	}
}
