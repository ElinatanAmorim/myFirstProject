package br.gov.caixa;

import java.util.Arrays;

public class MinhaAplicacao {

    public static void main(String[] args) {
        //exemploArray();
        exemploArray2();

        int a = 1;
    }

    /*public static void exemploArray() {
        //FOR
        //for (iniciar varControle: condicao; incremento varControle)
        for (int i = 8; i < 3; i += 5) {
            System.out.println(i);
        }
    }

    //WHILE
    //while (condicao) {implementtacao}
    boolean executar = true;

    int contador;

    while(executar)

    {
        System.out.println("Imprimir algo");
        break;
        return;
    }*/

    public static void exemploArray2() {
        //tipo [] nomeVariavel;
        //tipo nomeVariavel [];
        int nomeVariavel[] = new int[5];
        int nomeVariavel2[] = {1,2,3};

       char meuNomeArray[] = {'M', 'E','U'};
        Arrays.copyOfRange(meuNomeArray, 0, 2);
        System.out.println("Meu nome".charAt(2));
    }
}


    /*public static void

    public static void main(String[] args) {
        for (int tabuada = 0; tabuada <= 10; tabuada++) {

            System.out.println(tabuada * 2);
        }

        int saldo = 0;
        do {
            System.out.println("Faz um pix para os alunos");
            saldo--;
        } while (saldo > 9588);
    }


    /*enum FaixaEtaria {
        CRIANCA,
        ADOLESCENTE,
        ADULTO,
        IDOSO
    }

    enum scolaridade {
        ensinomedio,
        ensinofundamental,
        posgraduacao,
        doutorado,
        mestrado,
    }

    public static void main(String[] args) {
        System.out.println("Vamos!");

        // tipo nomevariavel = valor
        int valor1 = 2;
        int valor2 = 8;
        int totalsoma = valor1 + valor2;
        int divisao = valor2 / valor1;
        int subtracao = valor2 - valor1;
        int multiplicacao = valor2 * valor1;

        int idade = 20;

        FaixaEtaria faixaetaria;

        if (idade < 14) {
            faixaetaria = FaixaEtaria.CRIANCA;
        } else if (idade < 18) {
            faixaetaria = FaixaEtaria.ADOLESCENTE;
        } else if (idade < 65) {
            faixaetaria = FaixaEtaria.ADULTO;
        } else {
            faixaetaria = FaixaEtaria.IDOSO;
        }

        System.out.println("Faixa etária é: " + faixaetaria);
        System.out.println("Total é: ");
        System.out.println(totalsoma);
        System.out.println("O resultado da divisão é: ");
        System.out.println(divisao);
        System.out.println("A subtração é: ");
        System.out.println(subtracao);
        System.out.println("O resultado da multiplicação é: ");
        System.out.println(multiplicacao);

    }
}*/

