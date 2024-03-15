package Exercícios.ModI;

public class ContaBancaria {
    private String agencia;
    private int conta;
    private double saldo;

    public ContaBancaria(String agencia, int conta, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public String setSaldo(double novoSaldo) {
        if (novoSaldo < 0) {
            return "Saldo insuficiente";
        } else {
            this.saldo = novoSaldo;
            return "Saldo atualizado";
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria("001", 123456, 1000.0); // Agência, Conta e Saldo inicial

        // Consultar saldo
        System.out.println("Saldo atual: " + conta.getSaldo());

        // Atualizar saldo
        System.out.println(conta.setSaldo(1500.0)); // Saída esperada: Saldo atualizado
        System.out.println("Saldo atual: " + conta.getSaldo());

        System.out.println(conta.setSaldo(-500.0)); // Saída esperada: Saldo insuficiente
        System.out.println("Saldo atual: " + conta.getSaldo()); // Saída esperada: 1500.0 (saldo não alterado)

        // Tentativa de acesso direto aos atributos (o compilador não permitirá)
        // System.out.println(conta.saldo); // Isso resultará em um erro de compilação
    }
}

