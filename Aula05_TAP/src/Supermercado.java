import java.util.LinkedList;

public class Supermercado {
	
		//PROPRIEDADES DA CLASSE
	private static LinkedList<Caixa> colecao = new LinkedList<Caixa>();
	
		//METODO DA CLASSE
	public static void adicionarCaixa(int identificador) {
		colecao.add(new Caixa(identificador));
	}
	
	public static void removerCaixa() {
		if (colecao.size() > 0) {
			colecao.remove(0);
		}
	}
	public static LinkedList<Caixa> getColecao() {
		return colecao;
	}
}
