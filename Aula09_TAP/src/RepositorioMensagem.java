import java.util.ArrayList;

public class RepositorioMensagem {
	//Propriedades da classe
	private static ArrayList<String> colecaoMensagem = new ArrayList<String>();
	
	//Metodos da classe
	public static synchronized void enviarMensagem(String texto) {
		colecaoMensagem.add(texto);
	
	}
	public static synchronized String transmitirMensagem() {
		return colecaoMensagem.remove(0);
	}
	public static synchronized int getQuantidadeMensagem() {
		return colecaoMensagem.size();
	}
	
	public synchronized static  ArrayList<String> getMensagem() {
		return colecaoMensagem;
	}
}
