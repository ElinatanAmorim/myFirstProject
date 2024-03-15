package Exercícios.ModI;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class FaixaEtaria {

     enum FAIXAETARIA {
        CRIANCA(0,12),
        ADOLESCENTE(13,17),
        ADULTO(18,60),
        IDOSO(61,100),
        //INVALIDO("Opção inválida")
    ;

    int idadeInicial;
    int idadeFinal;
    String descricao;

    FAIXAETARIA(int idadeInicial, int IdadeFinal) {
        this.idadeInicial = idadeInicial;
        this.idadeFinal = idadeFinal;
        this.descricao = descricao;
    }

        public static void main(String[] args) {
        System.out.println(FAIXAETARIA.ADOLESCENTE.idadeFinal);
    }

        /*FAIXAETARIA[] faixas = FAIXAETARIA.values();

        for (FAIXAETARIA faixaetaria : faixas) {

            System.out.println("%s: %s (%d-%d)");
        }
    }*/
    }
}
