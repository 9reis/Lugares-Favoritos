import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

		String nomeDoLugar = tela("Qual o nome do lugar?");
		Lugar lugar = new Lugar(nomeDoLugar);
		
		//int i = 0;
		//while(i<3){i++}
		while(true) {
			try {
				String avaliacaoString = tela("Qual a Avaliação?");
				int avaliacao = Integer.parseInt(avaliacaoString);
				lugar.addAvaliacao(avaliacao);
			}catch(NumberFormatException e) {
				break;
			}
		}
			telaMsg(lugar);
			lugar.mostraNoMapa();
		
		
	}

	private static void telaMsg(Lugar lugar) {
		JOptionPane.showMessageDialog(null, lugar);
	}

	private static String tela(String pergunta) {
		return JOptionPane.showInputDialog(pergunta);
	}

}
