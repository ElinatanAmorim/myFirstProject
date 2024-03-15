package Exercícios.ModI;

public class Revendedora {
    public static double valorProdutoFinal(double[] input) {
        double valorProduto = input[0];
        double estado = input[1];

        double taxaImposto = 0.0;

        switch ((int)estado) {
            case 1:
                taxaImposto = 0.07; // MG
                break;
            case 2:
                taxaImposto = 0.12; // SP
                break;
            case 3:
                taxaImposto = 0.15; // RJ
                break;
            default:
                return -1.0; // Estado desconhecido
        }

        double precoFinal = valorProduto * (1 + taxaImposto);
        return Math.round(precoFinal * 10000.0) / 10000.0; // Arredondamento para 4 casas decimais
    }

    public static void main(String[] args) {
        // Teste do programa
        double[] input1 = {250.10, 1.0};
        double[] input2 = {220.50, 3.0};

        System.out.println("Saída 1: " + valorProdutoFinal(input1));
        System.out.println("Saída 2: " + valorProdutoFinal(input2));
    }
}
