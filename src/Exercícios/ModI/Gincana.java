package Exercícios.ModI;

import java.util.ArrayList;
import java.util.List;

public class Gincana {
    public static String[] substringStr(String[] input) {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i != j && input[j].contains(input[i])) {
                    substrings.add(input[i]);
                    break;
                }
            }
        }

        return substrings.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] input1 = {"as", "mas", "amor", "amoreco"};
        String[] output1 = substringStr(input1);
        for (String str : output1) {
            System.out.print(str + " ");
        }
        System.out.println();

        String[] input2 = {"carro", "ca", "paz", "pá"};
        String[] output2 = substringStr(input2);
        for (String str : output2) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
