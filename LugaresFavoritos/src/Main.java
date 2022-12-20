import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

		Lugar loja = new Lugar("Bom Preço");
		// mercado.mostraNoMapa();

		loja.addAvaliacao(5);
		loja.addAvaliacao(4);
		loja.addAvaliacao(3);

		Integer total = loja.totalAvaliacoes();
		System.out.println(total);
	}

}
