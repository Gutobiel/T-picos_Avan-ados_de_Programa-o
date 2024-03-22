import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;

	private JLabel lblNumero = new JLabel("");
	private JButton btnSair = new JButton("Sair");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Principal().setVisible(true);
	}
	
	// Método construtor cheio da classe
	public Principal() {
		// Configuração da janela
		setTitle("Demonstração Produto x Consumidor");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuração da label
		lblNumero.setBounds(180, 0, 280, 100);
		add(lblNumero);
		lblNumero.setFont(new Font("Arial", Font.BOLD, 40));
		
		// Configuração do botão
		btnSair.setBounds(150, 100, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// Configuração das Threads
		new Incrementadora().start();
		new Decrementadora().start();
		new Exibidora(this, lblNumero).start();
	}
}