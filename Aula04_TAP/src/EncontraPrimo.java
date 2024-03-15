import java.math.BigInteger;

public class EncontraPrimo extends Thread {

    // Propriedads da classe
    private BigInteger candidatoPrimo = null;

    // Método construtor da classe
    public EncontraPrimo(BigInteger candidatoPrimo) {
        super();
        this.candidatoPrimo = candidatoPrimo;
    }

    public void run() {
        boolean achei = true; // Variável para verificar se o número é primo

        for (BigInteger divisor = BigInteger.TWO;
             divisor.compareTo(candidatoPrimo.divide(BigInteger.TWO)) < 0; // Dividir por 2 é suficiente para verificar divisibilidade
             divisor = divisor.add(BigInteger.ONE)) {
            if (candidatoPrimo.remainder(divisor).equals(BigInteger.ZERO)) { // Verifica se é divisível
                achei = false; // Se for divisível, não é primo
                break;
            }
        }

        if (achei) { // Se não foi encontrado nenhum divisor, então é primo
            System.out.println("========================");
            System.out.println("ACHEI !!! FIQUEI RICO !!!");
            System.out.println(candidatoPrimo);
        } 
    }
}
