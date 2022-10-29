package Basico;

public class Array_Mult_Dimensional {
    public static void main(String[] args) {


//cria dois ou mais Arrays, na atribuição de valor o primeiro cochete indica qual será o Array
// que irá receber o valor e o segundo qual será o indice ou posição
        String[][] nomes = new String[2][2];
        nomes[0][0] = "janeiro";
        nomes[0][1] = "fevereiro";
        nomes[1][0] = "março";
        nomes[1][1] = "abril";
// para o foreach ler o Array multdimensional tem que criar uma variavel Array do mesmo tipo do Array que receberá e
// depois tem que criar outro foreach para comparar com uma variavel do mesmo tipo primitivo
        for (String[] var : nomes) {
            for (String Aux : var) {
//               System.out.println(Aux);
                switch (Aux) {
                    case "janeiro":
                        System.out.println(Aux + " Mês 01");
                        break;
                    case "fevereiro":
                        System.out.println(Aux + " Mês 02");
                        break;
                    case "março":
                        System.out.println(Aux + " Mês 03");
                        break;
                    case "abril":
                        System.out.println(Aux + " Mês 04");
                        break;
                }

            }

        }
    }
}
