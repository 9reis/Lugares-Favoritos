import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Lugar {

	public String nome;
	public String avaliacao;
	
	public Lugar(String nome) {
		this.nome = nome;
	}

	public void mostraNoMapa() throws IOException, URISyntaxException {
		Desktop.getDesktop().browse(new URI("http://www.google.com/maps/search/?api=1&query="+nome));
	} 
	
}
