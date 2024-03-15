package Exercícios.ModI;

public class Fibonacci {
    public static String geraSequenciaFibonacci(int input) {
        StringBuilder resultado = new StringBuilder();
        int a = 0;
        int b = 1;
        resultado.append(a).append(", "); // Adiciona o primeiro número da sequência (0)
        while (b <= input) {
            resultado.append(b).append(", "); // Adiciona o próximo número da sequência
            int temp = a + b;
            a = b;
            b = temp;
        }
        // Remove a vírgula extra no final e retorna a sequência
        return resultado.substring(0, resultado.length() - 2);
    }

    public static void main(String[] args) {
        // Testando a função com exemplos
        System.out.println(geraSequenciaFibonacci(0)); // Saída: 0, 1, 1, 2, 3
        System.out.println(geraSequenciaFibonacci(6)); // Saída: 0
        System.out.println(geraSequenciaFibonacci(8)); // Saída: 0, 1, 1, 2, 3, 5, 8
    }
}
