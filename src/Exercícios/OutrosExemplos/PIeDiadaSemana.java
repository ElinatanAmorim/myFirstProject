package Exercícios.OutrosExemplos;

import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class PIeDiadaSemana {

    enum DiadaSemana {
        segunda, terça, quarta, quinta, sexta, sábado, domingo
    }

    public static void main(String[] args) {
        double PI = Math.PI;
        
        System.out.println("Valor de PI: " + PI); // Imprime o valor de PI

        //Obtém e imprime o dia da semana atual
        DayOfWeek diaAtual = LocalDate.now().getDayOfWeek();
            System.out.println("Dia da semana: " + diaAtual);

        DiadaSemana DiaAtual = obterDiadaSemanaAtual();
            System.out.println("Dia da semana: " + DiaAtual);

        String PIFormatado = formatarPI(PI);
        System.out.println("Valor de PI formatado: " + PIFormatado);
    }

    // Método para obter o dia da semana atual
    public static DiadaSemana obterDiadaSemanaAtual() {
        // Obtém o dia da semana atual utilizando LocalDate.now()
        DayOfWeek diaJavaTime = LocalDate.now().getDayOfWeek();

        // Mapeia o dia da semana Java Time para o enum DiaDaSemana
        switch (diaJavaTime) {
            case MONDAY:
                return DiadaSemana.segunda;
            case TUESDAY:
                return DiadaSemana.terça;
            case WEDNESDAY:
                return DiadaSemana.quarta;
            case THURSDAY:
                return DiadaSemana.quinta;
            case FRIDAY:
                return DiadaSemana.sexta;
            case SATURDAY:
                return DiadaSemana.sábado;
            case SUNDAY:
                return DiadaSemana.domingo;
            default:
                return null; // Tratamento de erro, se necessário
        }
    }
    // Método para formatar o valor de PI com duas casas decimais
    public static String formatarPI(double PI) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(PI);
    }
}
