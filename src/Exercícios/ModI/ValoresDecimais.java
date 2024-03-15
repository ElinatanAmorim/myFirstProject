package Exercícios.ModI;

import java.util.HashSet;
import java.util.Set;

public class ValoresDecimais {
        public static boolean elementosRepetidos(double[] input) {
            // Criar um conjunto para armazenar os elementos únicos
            Set<Double> set = new HashSet<>();

            // Iterar sobre o array de entrada
            for (double num : input) {
                // Se o elemento já estiver presente no conjunto, significa que é repetido
                if (set.contains(num)) {
                    return true;
                } else {
                    // Adicionar o elemento ao conjunto
                    set.add(num);
                }
            }
            // Se nenhum elemento foi repetido, retornar false
            return false;
        }

        public static void main(String[] args) {
            // Exemplo de uso
            double[] input1 = {2.5, 3.2, 4.5, 5, 6};
            double[] input2 = {2, 2, 3.1, 4, 4.1, 4.1};

            System.out.println("Exemplo 1: " + elementosRepetidos(input1)); // Saída: false
            System.out.println("Exemplo 2: " + elementosRepetidos(input2)); // Saída: true
            }
}

