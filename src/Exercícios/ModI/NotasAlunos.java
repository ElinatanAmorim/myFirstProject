package Exercícios.ModI;

public class NotasAlunos {
    public static void main(String[] args) {
        double[] notasAluno = {8.5, 2.0, 6.5, 8.5}; // Exemplo de notas do aluno: N1=7.5, N2=8.0, N3=6.5, média dos exercícios=8.5
        System.out.println(calcularConceito(notasAluno)); // Saída esperada: B
    }

    public static char calcularConceito(double[] notasAluno) {
        if (notasAluno.length != 4) {
            throw new IllegalArgumentException("O array deve conter exatamente 4 elementos: as três primeiras notas e a média dos exercícios.");
        }

        double mediaAproveitamento = (notasAluno[0] + notasAluno[1] * 2 + notasAluno[2] * 3 + notasAluno[3]) / 7;

        if (mediaAproveitamento >= 9.0) {
            return 'A';
        } else if (mediaAproveitamento >= 7.5) {
            return 'B';
        } else if (mediaAproveitamento >= 6.0) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
