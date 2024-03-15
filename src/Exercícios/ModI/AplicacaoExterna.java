package Exercícios.ModI;

public class AplicacaoExterna {
    public static void main(String[] args) {
        String[] arrayOrig = {"a","b","c"};
        String[] arrayNovo = new String[arrayOrig.length +1];

        for (int i = 0; i < arrayOrig.length; i++) {
            String valor = arrayOrig[i];
            arrayNovo[i] = valor;
        }

        System.out.println(
                arrayNovo[0] + " / " +
                arrayNovo[1] + " / " +
                arrayNovo[2] + " / " +
                arrayNovo[3]
        );
    }
}
