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
		String nomeURL = this.nome.replace(" ", "%20");
		Desktop.getDesktop().browse(new URI("http://www.google.com/maps/search/?api=1&query="+nomeURL));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

}
