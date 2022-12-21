import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

		Lugar loja = new Lugar("Bom Preço");
		// mercado.mostraNoMapa();

		loja.addAvaliacao(3);
		loja.addAvaliacao(5);
		loja.addAvaliacao(5);

		Integer total = loja.totalAvaliacoes();
		System.out.println("Total: " + total);
		
		Double media = loja.avaliacaoMedia();
		System.out.println("Média: " + media);
		
		String status = loja.avaliacaoStatus();
		System.out.println("Status: " + status);
		
	}

}
