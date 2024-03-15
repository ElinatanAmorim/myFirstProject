package Exercícios.OutrosExemplos;

public class Construtor {

    String nome;
    int idade;

    public Construtor(String nome, int idade) {

        this.nome =nome;
        this.idade =idade;
    }

    public static void main(String[] args) {
        Construtor constructor = new Construtor("Natan", 33);
        System.out.println("Meu nome é " + constructor.nome + " e tenho " + constructor.idade + " anos.");
    }
}
