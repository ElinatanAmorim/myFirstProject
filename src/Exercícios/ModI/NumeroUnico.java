package Exercícios.ModI;

import java.util.HashSet;

public class NumeroUnico {
        public static int numeroUnico(int[] input) {
            HashSet<Integer> set = new HashSet<>();

            for (int num : input) {
                if (set.contains(num)) {
                    set.remove(num);
                } else {
                    set.add(num);
                }
            }

            // Se sobrou apenas um elemento no conjunto, é o número único
            if (set.size() == 1) {
                return set.iterator().next();
            } else {
                return -1; // Número único não encontrado
            }
        }

        public static void main(String[] args) {
            int[] input1 = {1, 2, 2, 5, 5, 5, 4, 4, 10, 10};
            System.out.println(numeroUnico(input1)); // Saída: 1

            int[] input2 = {20, 22, 20};
            System.out.println(numeroUnico(input2)); // Saída: 22

            int[] input3 = {1, 1, 2, 2, 2, 3, 3};
            System.out.println(numeroUnico(input3)); // Saída: -1
        }
}