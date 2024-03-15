package Conteúdo;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o peso: ");
        double peso = sc.nextDouble();

        System.out.print("Agora informe a altura: ");
        double altura = sc.nextDouble();

        String nome = "Natan";
        System.out.print("Qual o seu nome: ");
        nome = sc.next();

        int fator = 2;
        double imc = (peso * altura) / fator;
        String imcFormatado = String.format("%.2f", imc);

        System.out.println("O resultado do IMC de " + nome + " é de: " + imcFormatado);
        //System.out.println("O resultado do IMC de " + nome + " é de: " + imc; Sem formatar IMC com 2 casas decimais

        System.out.println("_______________");
        double a = 4.5;
        double b = 6.5;
        System.out.println(a + b);

        //outra forma
        double obj = 6.5;
        double obj2 = 8.5;
        System.out.println(obj + obj2);

        String name = "Elinatan";
        System.out.printf("Meu nome é %s. \n", name); // O "\n" serve para criar uma nova linha
        System.out.println("Meu nome é " + name);
        teste(args); //preciso chamar o método teste dentro do main, eu não posso escrever um dentro do outro
    }

    public static void teste(String[] args) {
        double c = 4.0;
        double d = 6.0;
        System.out.println(c + d);
    }
}

    /*
    Aritméticos: soma (+), subtração (-), multiplicação (*) e divisão (/);
    Lógicos: negação (!), E (&&), OU (||) // duplo pipe
    Relacionais: maior que (>), menor que (<), igual (==), diferente (!=)
    Ternário: ? :
    % resto de divisão

    */