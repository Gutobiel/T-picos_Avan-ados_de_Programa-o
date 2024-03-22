import java.util.ArrayList;

public class Caixa extends Thread{
		
		//PROPRIEDADES DA CLASSE
	private int identificador = 0;
	private ArrayList<Cliente> fila = new ArrayList<Cliente>();
	
		//METODO CONSTRUTOR CHEIO DA CLASSE
	public Caixa(int identificador) {
		super();
		this.identificador = identificador;
	}
	
		//METODO GET/SET DA CLASSE
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
		//METODOS DA CLASSE
	public void colocarClienteNaFila(Cliente objCliente) {
		fila.add(objCliente);
	}
	
	public synchronized Cliente retirarClienteDaFila() {
			Cliente retorno = null;
			try {
				retorno = fila.remove(fila.size()-1);
			} catch (Exception erro) {}
			return retorno;
	}
	
	public int getQuantidadeClientesNaFila() {
		return fila.size();
	}
	
		//METODO DE EXECUÇÃO PARALELA
	public void run() {
		while (true) {
			if (fila.size() > 0) {
				try {
					sleep(fila.get(0).getTempoAtendimento()* 1000);
				} catch (Exception e) {}
				
				fila.remove(0); //ROUBA UM CLIENTE DE OUTRO CAIXA
			} else {
				int maisClientes = 0; //CAIXA COM MAIS CLIENTES
				int numeroDoCaixa = 0;
				
				for (Caixa objCaixa : Supermercado.getColecao()) {
					if (objCaixa.getIdentificador()!= identificador) {
						if (maisClientes < objCaixa.getQuantidadeClientesNaFila()) {
							maisClientes = objCaixa.getQuantidadeClientesNaFila();
							numeroDoCaixa = objCaixa.getIdentificador();
							}
						}
					}
				colocarClienteNaFila(Supermercado.getColecao()
						.get(numeroDoCaixa)
						.retirarClienteDaFila());
				}
			}
		}
	}

