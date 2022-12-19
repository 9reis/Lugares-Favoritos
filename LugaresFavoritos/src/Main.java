import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

		Lugar mercado = new Lugar("Boa vista do lobato");
		
		mercado.setNome("Alto do cabrito");
		mercado.mostraNoMapa();
	}

}
