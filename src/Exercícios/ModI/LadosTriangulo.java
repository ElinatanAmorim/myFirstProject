package Exercícios.ModI;

public class LadosTriangulo {
    public static boolean eUmTriangulo(int[] input) {
        if (input.length != 3) {
            return false; // Se o array não tiver três valores, não pode ser um triângulo
        }

        // Verifica se a soma de dois lados é sempre maior que o terceiro lado
        return (input[0] + input[1] > input[2] &&
                input[1] + input[2] > input[0] &&
                input[0] + input[2] > input[1]);
    }
}


