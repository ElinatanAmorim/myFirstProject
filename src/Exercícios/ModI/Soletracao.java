package Exercícios.ModI;

import java.util.Arrays;

public class Soletracao {
    public static String[] soletrandoStr(String input) {
        // Cria um array de strings para armazenar os caracteres da palavra
        String[] caracteres = new String[input.length()];

        // Percorre cada caractere da palavra
        for (int i = 0; i < input.length(); i++) {
            // Converte o caractere em uma string e adiciona ao array de caracteres
            caracteres[i] = String.valueOf(input.charAt(i));
        }

        // Retorna o array de caracteres
        return caracteres;
    }

    // Função principal para testar a solução
    public static void main(String[] args) {
        // Exemplos de uso da função soletrandoStr
        String[] resultado1 = soletrandoStr("amor");
        String[] resultado2 = soletrandoStr("carro");

        // Imprime os resultados
        System.out.println("Resultado 1: " + Arrays.toString(resultado1)); // Saída: ["a", "m", "o", "r"]
        System.out.println("Resultado 2: " + Arrays.toString(resultado2)); // Saída: ["c", "a", "r", "r", "o"]
    }
}
