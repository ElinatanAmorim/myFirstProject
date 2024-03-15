package Exercícios.ModI;

public class CondicionaiseOperadores {
    public static int somaAlgarismos(int input) {
        if (input <= 0) {
            return -1; // Retorna -1 se o número não for maior que zero
        }

        int soma = 0;
        while (input > 0) {
            soma += input % 10; // Adiciona o último algarismo à soma
            input /= 10; // Remove o último algarismo do número
        }

        return soma;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int numero1 = 135;
        int numero2 = 462;

        System.out.println("Entrada: " + numero1);
        System.out.println("Saída: " + somaAlgarismos(numero1));

        System.out.println("Entrada: " + numero2);
        System.out.println("Saída: " + somaAlgarismos(numero2));
    }
}
