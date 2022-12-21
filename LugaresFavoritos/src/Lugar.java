import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Lugar {

	private String nome;
	private List<Integer> avaliacoes = new ArrayList<>();
	
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

	public void addAvaliacao(int avaliacao ) {
		this.avaliacoes.add(avaliacao);
		
	}

	public Integer totalAvaliacoes() {
		return this.avaliacoes.size();
	}

	public Double avaliacaoMedia() {
		
		return somaDasAvaliacoes()/totalAvaliacoes();
	}

	private Double somaDasAvaliacoes() {
		Double soma = 0.0;
		
		for(Integer avaliacao : avaliacoes ) {
			soma += avaliacao;
		}
		return soma;
	}

}
