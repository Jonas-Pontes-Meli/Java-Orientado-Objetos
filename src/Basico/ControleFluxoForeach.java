package Basico;

public class ControleFluxoForeach {
    public static void main(String[] args) {
        int[] Array1 = new int[5];
        Array1[0] = 1;
        Array1[1] = 2;
        Array1[2] = 3;
        Array1[3] = 4;
        Array1[4] = 5;
 //cria uma variavel local e compara para ver se contém "para cada valor contido em Array exexute esse bloco"
//quantas vezes ele encontrar o valor séra quantas vezes ele executará o bloco
        for (int valor : Array1) {

            System.out.println("O valor em Array contém " + valor);

        }

    }
}
