import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um lugar no nosso codigo 
 * @author Rubem
 *
 */
public class Lugar {

	private String nome;
	private List<Integer> avaliacoes = new ArrayList<>();
	
	public Lugar(String nome) {
		this.nome = nome.toUpperCase();
	}

	/**
	 * Exibe o nome do lugar utilizando a API do Google Maps
	 * @throws IOException
	 * @throws URISyntaxException
	 */
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
	
	/**
	 * Adiciona uma avaliacao na lista de avaliação do lugar 
	 * @param avaliacao
	 */
	public void addAvaliacao(int avaliacao ) {
		if(avaliacao < 0 || avaliacao > 5) {
			//estourar um erro 
			throw new RuntimeException("Avaliação deve ter de 1 a 5 estrelas");
		}
		this.avaliacoes.add(avaliacao);
		
	}
	
	/**
	 * Calcula o total de avaliacoes que o local teve
	 * @return o total de avaliações
	 */
	public Integer totalAvaliacoes() {
		return this.avaliacoes.size();
	}

	/**
	 * Calcula a media de avaliacoes que o local teve
	 * @return a media de avaliações
	 */
	public Double avaliacaoMedia() {

		return somaDasAvaliacoes()/totalAvaliacoes();
	}

	/**
	 * Calcula a soma de todas as avaliacoes que o local teve
	 * @return soma todas as avaliações
	 */
	private Double somaDasAvaliacoes() {
		Double soma = 0.0;
		
		for(Integer avaliacao : avaliacoes ) {
			soma += avaliacao;
		}
		return soma;
	}

	/**
	 * Retorna o Status da avaliacao 
	 * @return
	 */
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
