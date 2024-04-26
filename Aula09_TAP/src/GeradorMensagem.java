
public class GeradorMensagem extends Thread {
	
	//Propriedades da classe
	private int identificador = 0;
	private int numeroMensagem = 0;
	
	//Metodo construtor da classe
	public GeradorMensagem(int identificador) {
		this.identificador = identificador;
	}
	
	//Metodo de execução paralela da classe
	public void run() {
		int  tempoDeEnvio = (5 +(int) (10 * Math.random()));
		
		while (true) {
			RepositorioMensagem.enviarMensagem("Mensagem " + numeroMensagem + 
					" enviada pelo gerador " + identificador);
			numeroMensagem++;
			
			try {
				sleep(300 * tempoDeEnvio);
			} catch (Exception e) {}
		}
	}	
}
