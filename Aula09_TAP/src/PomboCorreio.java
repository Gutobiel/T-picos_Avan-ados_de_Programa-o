import javax.swing.JTextArea;

public class PomboCorreio extends Thread {
	
	private JTextArea txtTransmitidas = null;
	
	//Metodo construtor cheio daclasse
	public PomboCorreio(JTextArea txtTransmitidas) {
		super();
		this.txtTransmitidas = txtTransmitidas;
	}
	
	public void run() {
		while (true) {
			if (RepositorioMensagem.getQuantidadeMensagem() < 20) {
				try {
					sleep(1000);
				} catch (Exception e) {}
				continue;
			}
			String temp = "";
			for(int i = 0; i < 20; i++) {
				temp += (RepositorioMensagem.transmitirMensagem() + "\n");
			}
			try {
				sleep(100);
			} catch (Exception e) {}
			txtTransmitidas.append(temp);
		}
	}
}
