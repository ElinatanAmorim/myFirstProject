package Exercícios.ModI;

public class ArrayDinamico {

    private String arrayOrigem[];
    private static final String TEXTO_PADRAO = "Texo padrão";

    //Construtor - modificador nomedaClasse (parametros) {}
    public ArrayDinamico(int length) {
        this.arrayOrigem = new String[length];

        // for (iniviar variável condição : incrementar variavel) {}
        for (int i = 0; 1< this.arrayOrigem.length; i++) {
            this.arrayOrigem[i] = TEXTO_PADRAO;
        }
    }

    public int getLenth() {return this.arrayOrigem.length; }

    public void adicionar(String novoItem) {
        String[] novoArray = new String[getLenth() +1];

        System.arraycopy(arrayOrigem, 0, novoArray,0, getLenth());

        novoArray[getLenth()] = novoItem;
        this.arrayOrigem = novoArray;
    }

    //- Criar método para verificar se um valor existe no nosso arrayDinamico
   public boolean contemTexto( String texto) {
        for (String s : this.arrayOrigem) {
            if(s.equals(texto)) {
                return true;
            }
        }
        return false;
   }
    /* O QUE É @Override?????? Hudson utilizou
    public void imprimirValores() {
        for (String)

    }*/

    /*public static void main(String[] args) {
        ArrayDinamico arrayDinamico = new ArrayDinamico(2);
        arrayDinamico.imprimirValores();
    }

    /*Método - modificador tipoRetorno nomeMetodo(parametros) {}
    public void Array(int length) {
    }*/
}
