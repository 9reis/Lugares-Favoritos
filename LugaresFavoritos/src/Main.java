import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

		Lugar mercado = new Lugar("Ribeira");
		
		mercado.setNome(null);
		mercado.mostraNoMapa();
		
	}

}
