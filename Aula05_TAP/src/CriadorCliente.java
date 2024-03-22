
public class CriadorCliente extends Thread{
	public void run() {
		while (true) {
			
		
		try {sleep(2800);} catch (Exception e) {}
	
		int menosClientes = 200000000;
		int numeroDoCaixa = 0;
		
		for (Caixa objCaixa : Supermercado.getColecao()) {
			if (menosClientes > objCaixa.getQuantidadeClientesNaFila()) {
				menosClientes = objCaixa.getQuantidadeClientesNaFila();
				numeroDoCaixa = objCaixa.getIdentificador();
			}
		}
		Supermercado.getColecao().get(numeroDoCaixa).colocarClienteNaFila(new Cliente());
		}
	}
}