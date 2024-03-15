package Conteúdo;

import java.util.ArrayList;

public class AulaYoutube {

    public static void main(String[] args) {
        String nome = "Natan";
        double idade = 5;

        //Array
        int [] idades = {2,3,4}; //significa que o array tem faixa de representação 3
        idades[0] = 4; //outra forma de fazer o array
        int[] idades2 = new int[10]; //array de forma dinâmica Arraylist
        ArrayList<Integer> idades3 = new ArrayList<Integer>();
        idades3.add(22);
        idades3.add(50);
        idades3.add(30);
        idades3.remove(0); //remove a linha 1, o 22
        idades3.get(1);
        idades3.size(); //tamanho do Array

        //For
        for(var i = 0; i < idade; i++) {
            System.out.println("oi");
        }

        //while
        int i = 0;
        while (i < idade) {
            i++;
        }

        if( idade < 18) {
            System.out.println("Adolescente");
        }  else if (idade == 33) {
            System.out.println("Adulto");
        }  else {
            System.out.println("Idoso");
        }
    }
}

        //Tipos Primitivos
            //String não é primitivo, é uma Classe
                //Strings são imutáveis. Portanto, toda e qualquer manipulação de strings resulta em uma nova string.

            //Para Inteiros - a diferença é a extenção entre eles, aumentando na ordem ao lado, o mais comum é o int
                //byte, short, int, long;

            //Tipos de ponto flutuante
            // Doble (d) e float (f)
                // repreesentar nº, a diferença é a faixa de representação, Doble é mais preciso, mais casas decimais.
                //Para decimais, double geralmente, é a escolha. Porém, ele nunca deve ser usado para representar valores exatos, como moedas. Nesse caso, use BigDecimal

            //Variáveis - "Wrapper Classes".
            //Byte, Integer, Double, Short, Float, Long, para os tipos numéricos; Char e Boolean
            //boolean - true ou false
            //char para armazenar caracteres, exemplo char letra = "A", não pode ser "OIIII"

