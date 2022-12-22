import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

		String nomeDoLugar = tela("Qual o nome do lugar?");
		Lugar lugar = new Lugar(nomeDoLugar);
	
		String avaliacaoString = tela("Qual a Avaliação?");
		int avaliacao = Integer.parseInt(avaliacaoString);
		lugar.addAvaliacao(avaliacao);
		
		tela(lugar.toString());
		
	}

	private static String tela(String pergunta) {
		return JOptionPane.showInputDialog(pergunta);
	}

}
