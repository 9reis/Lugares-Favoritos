import javax.swing.JOptionPane;

/**
 * Classe responsável pelo fluxo principal do projeto
 * @author Lucas Reis 
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {

		String nomeDoLugar = tela("Qual o nome do lugar?");
		Lugar lugar = new Lugar(nomeDoLugar);
		
		//int i = 0;
		//while(i<3){i++}
		while(true) {
			try {
				String avaliacaoString = tela("Qual a Avaliação?");
				int avaliacao = Integer.parseInt(avaliacaoString);
				lugar.addAvaliacao(avaliacao);
			}catch(NumberFormatException e ) {
				break;
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
				break;
			}
		}
			telaMsg(lugar);
			lugar.mostraNoMapa();
		
	}

	/**
	 * Exibe tela com resumo de um lugar
	 * @param lugar - Lugar que será pesquisado 
	 */
	private static void telaMsg(Lugar lugar) {
		JOptionPane.showMessageDialog(null, lugar);
	}

	/**
	 * Exibe uma mensagem na tela e espera um input do usuário 
	 * @param String - String que será exibida na tela 
	 * @return
	 */
	private static String tela(String String) {
		return JOptionPane.showInputDialog(String);
	}

}
