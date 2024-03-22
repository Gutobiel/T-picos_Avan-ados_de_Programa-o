
public class Cliente {

		//PROPRIEDADES DA CLASSE
	private int tempoAtendimento = 0; //SIMULA O TAMANHO DO CARRINHO + TEMPO = CARRINHO MAIOR
	
		//METODO CONSTRUTOR VAZIO DA CLASSE
	public Cliente() {
		tempoAtendimento = (1 + (int) (1 * Math.random()));
	}
		//METODO GET DA CLASSE
	public int getTempoAtendimento() {
		return tempoAtendimento;
	}
}

