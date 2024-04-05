
public class Matriz {
	//Constantes da classe
	public static final int LIN1 = 2000;
	public static final int COL1LIN2 = 3000;
	public static final int COL2 = 2000;
	
	//Propriedades da classe
	private static int [][] operando1 = new int [LIN1] [COL1LIN2];
	private static int [][] operando2 = new int [COL1LIN2] [COL2];
	private static int [][] resultado = new int [LIN1] [COL2];
	
	//Metodo construtor da classe
	public Matriz() {
		for (int i = 0; i < LIN1 ; i++) {
			for (int j = 0; j <COL1LIN2; j++) {
				operando1 [i][j] = ((int) (100 * Math.random()));
			}
		}
		for (int i = 0; i < COL1LIN2 ; i++) {
			for (int j = 0; j < COL2; j++) {
				operando2 [i][j] = ((int) (100 * Math.random()));
			}
		}
	}
	
	//Metodos da classe
	public static int [][] getOperando1(){
		return operando1;
	}
	public static int [][] getOperando2(){
		return operando2;
	}
	public static void setResultado (int i, int j, int valor) {
		resultado[i][j] = valor;
	}
	
	private static void imprimirMatriz(int[][] matriz) {
		for (int i=0 ; i < matriz.length ; i++) {
			for (int j = 0; j < matriz[0].length ; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void imprimirOperando1() {
		System.out.println("===== OPERANDO 1 =====");
		imprimirMatriz(operando1);
	}
	public static void imprimirOperando2() {
		System.out.println("===== OPERANDO 2 =====");
		imprimirMatriz(operando2);
	}
	public static void imprimirResultado() {
		System.out.println("===== RESULTADO  =====");
		imprimirMatriz(resultado);
	}
}
