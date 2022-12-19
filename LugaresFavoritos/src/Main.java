import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

		String lugar = "Rissul";
		Double avaliacao = 5d/2d;
		
		mostrarLugarNoMapa(lugar);
		
	}

	private static void mostrarLugarNoMapa(String lugar) throws IOException, URISyntaxException {
		Desktop.getDesktop().browse(new URI("http://www.google.com/maps/search/?api=1&query="+lugar));
	}

}
