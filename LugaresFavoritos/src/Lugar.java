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
		if(avaliacao < 0 || avaliacao > 5) {
			//estourar um erro 
			throw new RuntimeException("Avaliação deve ter de 1 a 5 estrelas");
		}
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

	
	public String avaliacaoStatus() {
		
		Double media = avaliacaoMedia();
		
		if( media < 3 ) {
			return "Ruim";
		}else if( media >= 3 && media <= 4){
			return "Razoavel";
		}else {
			return "Muito bom";
		}
	}
	
	@Override
	public String toString() {
		
		return "nome: " + nome + "\n"
				+ "Total de avaliações: " + totalAvaliacoes() + "\n"
				+ "Media: " + avaliacaoMedia() + "\n"
				+ "Status: " + avaliacaoStatus();
	}
}
