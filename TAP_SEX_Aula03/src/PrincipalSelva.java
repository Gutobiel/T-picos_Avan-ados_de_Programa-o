import javax.swing.JFrame;

public class PrincipalSelva extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private Painel objPainel = new Painel();
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new PrincipalSelva().setVisible(true);
	}
	
	// Método construtor cheio da classe
	public PrincipalSelva() {
		setTitle("Jantar dos Selvagens");
		setSize(300, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Configuração do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		
		Cozinheiro objCozinheiro = new Cozinheiro();
		
		for (int i = 0 ; i < 5 ; i++) {
			new Selvagem(objCozinheiro).start();
		}
		
		objCozinheiro.start();
		
		new Desenhista(objPainel).start();
	}
}