package Exercícios.ModI;

public class PrimeiroCaracter {
    public static int primeiroCaractereUnico(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Verifica se o caractere atual ocorre apenas uma vez na string
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                return i; // Retorna o índice do primeiro caractere único
            }
        }
        // Se nenhum caractere único for encontrado, retorna -1
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(primeiroCaractereUnico("amor"));    // Saída: 0
        System.out.println(primeiroCaractereUnico("cocada"));  // Saída: 1
    }
}

