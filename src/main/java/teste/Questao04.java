package teste;

import java.text.DecimalFormat;

public class Questao04 {

    static double percentual(double valorEstado, double total) {
        double porcentagem;

        porcentagem = (valorEstado * 100) / total;

        return porcentagem;
    }

    public static void main(String[] args) {
        System.out.println("*----- Questão 04 ---------------------------------------------------------*\n");

        DecimalFormat df = new DecimalFormat("#,###.00");

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;

        System.out.println("faturamento mensal de uma distribuidora, detalhado por estado:");
        System.out.println("SP – R$67.836,43");
        System.out.println("RJ – R$36.678,66");
        System.out.println("MG – R$29.229,88");
        System.out.println("ES – R$27.165,48");
        System.out.println("Outros – R$19.849,53");

        System.out.println("\nfaturamento total da distribuidora: R$" + total);

        System.out.println("\nPercentual de participação de cada estado em relação ao faturamento total: ");
        System.out.println("SP: " + df.format(percentual(sp, total)) + "%");
        System.out.println("RJ: " + df.format(percentual(rj, total)) + "%");
        System.out.println("MG: " + df.format(percentual(mg, total)) + "%");
        System.out.println("ES: " + df.format(percentual(es, total)) + "%");
        System.out.println("Outros: " + df.format(percentual(outros, total)) + "%");
    }
}
