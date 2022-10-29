package Basico;

public class LacosRepeticao_While {
    public static void main(String[] args) {
        int parcela = 1;
        float valor = 30000;
        float valorParcela = 30000;
//compara variaveis enquanto o que tem dentro de parenteses for verdadeiro
// e só pode compartar com variaveis de mesmo tipo primitivo
        while (valorParcela != 1000) {
            System.out.println("e valor total de parcelad é" + parcela);
            valorParcela = valor / parcela;
            parcela++;
            System.out.println("valor da parcela" + valorParcela);
//tem o mesmo principio mas com a diferença que a comparação é ao final
// então não importa o resultado o código será executado pelo menos uma vez!
            do {
                System.out.println("executou o código!");

            } while (parcela == 0);


        }


    }
}
