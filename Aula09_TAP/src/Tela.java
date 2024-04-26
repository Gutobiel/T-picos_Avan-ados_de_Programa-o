import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Tela extends JFrame{
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private Painel objPainel = new Painel();
	
	private JTextArea txtMensagem = new JTextArea();
	private JScrollPane jspMensagem = new JScrollPane(txtMensagem);
	
	private JTextArea txtTransmitida = new JTextArea();
	private JScrollPane jspTransmitida = new JScrollPane(txtTransmitida);
	
	//Metodo principal de execução da classe
	public static void main(String[] args) {
		new Tela().setVisible(true);
	}
	
	public Tela() {
		setTitle("Envio de mensagem por Pombo Correio");
		setSize(1024,768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Confguração do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
	
	//Configuração da caixa de mensagem
		jspMensagem.setBounds(20,20,220,690);
		add(jspMensagem);
	//Configuração da caixa de transmitidas
		jspTransmitida.setBounds(760,20,220,690);
		add(jspTransmitida);
		
	//Configuração da Threads
		for(int i=0 ; i < 5; i++) {
			new GeradorMensagem(i).start();
		}
		new PomboCorreio(txtTransmitida).start();
		
		new AtualizadoraDeTela(txtMensagem, objPainel).start();
	}
	
}
