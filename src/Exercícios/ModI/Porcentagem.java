package Exercícios.ModI;

import java.text.DecimalFormat;

public class Porcentagem {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#,####");
        double valorFinal = 100.564632467898;
        String valorFinalFormatado = formatter.format(valorFinal);

        double valorFinalAjustado = Double.parseDouble(valorFinalFormatado);

        System.out.println(valorFinal + " // " + valorFinalAjustado + " // " + ((double) Math.round(valorFinal * 10000) / 10000.0));
    }
}
