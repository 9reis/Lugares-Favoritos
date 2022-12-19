import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Lugar {

	private String nome;
	private String avaliacao;
	
	public Lugar(String nome) {
		this.nome = nome.toUpperCase();
	}

	public void mostraNoMapa() throws IOException, URISyntaxException {
		Desktop.getDesktop().browse(new URI("http://www.google.com/maps/search/?api=1&query="+nome));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

}
