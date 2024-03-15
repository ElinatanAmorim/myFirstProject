package Exercícios.ModI;

import java.util.Arrays;

public class ConcursoNacional {
    public static String[] inverterPalavra(String input) {
        // Cria um array de strings para armazenar os caracteres da palavra invertida
        String[] caracteresInvertidos = new String[input.length()];

        // Inverte a palavra e armazena em uma string
        String palavraInvertida = new StringBuilder(input).reverse().toString();

        // Percorre cada caractere da palavra invertida
        for (int i = 0; i < palavraInvertida.length(); i++) {
            // Converte o caractere em uma string e adiciona ao array de caracteres invertidos
            caracteresInvertidos[i] = String.valueOf(palavraInvertida.charAt(i));
        }

        // Retorna o array de caracteres invertidos
        return caracteresInvertidos;
    }

    // Função principal para testar a solução
    public static void main(String[] args) {
        // Exemplo de uso da função inverterPalavra
        String[] resultado = inverterPalavra("amor");

        // Imprime o resultado
        System.out.println("Resultado: " + Arrays.toString(resultado)); // Saída: ["r", "o", "m", "a"]
    }
}

