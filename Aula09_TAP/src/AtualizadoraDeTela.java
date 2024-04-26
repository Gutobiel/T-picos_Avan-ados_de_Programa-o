import javax.swing.JTextArea;

public class AtualizadoraDeTela extends Thread {
	//Propriedades da classe
	private JTextArea txtMensagem = null;
	private Painel objPainel = null;
	
	//Metodo construtor da classe
	public AtualizadoraDeTela (JTextArea txtMensagem, Painel objPainel ) {
		super();
		this.txtMensagem = txtMensagem;
		this.objPainel = objPainel;
	}
	
	@Override
	public void run() {
		while (true) {
			String temp = "";
			for (int i = 0; i <RepositorioMensagem.getQuantidadeMensagem(); i++) {
				temp += (RepositorioMensagem.getMensagem().get(i) + "\n");
				}
				txtMensagem.setText(temp);
				try {
					Thread.sleep(10);
				} catch (Exception e) {}
				
				objPainel.incrementarX();
				objPainel.repaint();
			}
		}
	}

