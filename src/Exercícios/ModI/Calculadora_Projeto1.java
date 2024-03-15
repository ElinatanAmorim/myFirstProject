package Exercícios.ModI;

import java.util.Scanner;

public class Calculadora_Projeto1 {

    public enum Operacao {
             ADICAO,
             SUBTRACAO,
             MULTIPLICACAO,
             DIVISAO
         }

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Vamos começar?!");

            double x,y = 0;
            System.out.print("Digite o primerio número (x): ");
            x = scanner.nextDouble();

            System.out.print("Digite o segundo número (y): ");
            y = scanner.nextDouble();

            //Se não usasse o enum
            /*System.out.println("1. Adição:");
            System.out.println("2. Subtração:");
            System.out.println("3. Multiplição:");
            System.out.println("4. Divisão:");*/

            System.out.println("Selecione umas das operações abaixo: ");

            int i = 1;
            for (Operacao operacao : Operacao.values()) {
                System.out.println(i + ". " + operacao);
            i++;
            }

            int opcao = scanner.nextInt();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = x + y;
                    break;
                case 2:
                    resultado = x - y;
                    break;
                case 3:
                    resultado = x * y;
                    break;
                case 4:
                    if( y != 0) {
                        resultado = x / y;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opção Inválida, escolha outra opção");
                    return;
            }

            System.out.println("O resultado da operação " + opcao + " é: " + resultado);
     }
}

