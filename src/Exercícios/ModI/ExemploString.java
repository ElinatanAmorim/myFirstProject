package Exercícios.ModI;

public class ExemploString {

    public static void main(String[] args) {
        // Registro [5] = Nome [10] + Sequencia [1] = [16]
        String entrada01 = "00000Hudson     1";
        String registro = entrada01.substring(0, 5); // "00000"
        String nome = entrada01.substring(0, 15); // "Hudson     "
        String sequencia = entrada01.substring(15); // "1"

        System.out.println(registro);
        System.out.println(nome);
        System.out.println(sequencia);

        String entrada02 = "valor1_valor2_valor3_";
        System.out.println("===================");
        System.out.println(entrada02.charAt(6));
        System.out.println(entrada02.indexOf("_")); //6
        System.out.println(entrada02.indexOf("valor2")); //7
        System.out.println(entrada02.lastIndexOf("_")); // 28

        /*String[] arrayString = entrada02.split("_");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("[" + i + "]==" +arrayString[i]);
            String partString = arrayString[i];
            String[] arrayPartString = arrayPartString[];
            int value = Interger.porseInt(partOfPartString.replaceAll());*/

     }
}
