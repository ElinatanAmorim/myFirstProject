package Conteúdo;

import java.util.Scanner;

//FOR WHILE DOWHILE
public class ForeWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos começar!");

        System.out.print("Digite o valor de (i): ");
        int i = scanner.nextInt();
        //FOR (iniciar varControle: condicao; incremento varControle) {}
        //for (int i = 2; i < 3; i += 5) { //outra aplicação
        for (; i < 3; i += 5) { //Removemos a declaração e inicialização da variável i antes do loop, pois já a inicializamos na entrada do usuário.
            System.out.println("O valor de i é " + i);
        }

        System.out.println("Agora vamos escolher o valor de contador:");
        int contador = scanner.nextInt();

        //WHILE (condicao) {implementtacao}
        //int contador = 0;
        while (contador < 5) {
            System.out.println("O valor do contador é: " + contador);
            contador++;
        }
    }
}