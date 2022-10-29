package Basico;

import java.lang.reflect.Array;

public class ControleFluxoSwitch {
    public static void main(String[] args) {
        String Semana = "sabado";
//cria um controle referenciando o que tem dentro do parenteses e caso seja e, ssa execute isso ou
// caso seja aquilo execute esse outro, mas se não por a clausula break todos os códigos serão executados
        switch (Semana){
            case "sabado":
                System.out.println("7° dia");
                break;
            case "domingo":
                System.out.println("1° dia");
                break;
            case "segunda":
                System.out.println("2° dia");
                break;
            case "terça":
                System.out.println("3° dia");
                break;
            case "quarta":
                System.out.println("4° dia");
                break;
            case "quinta":
                System.out.println("5° dia");
                break;
            case "sexta":
                System.out.println("6° dia");
                break;
        }
        System.out.println("esse é o resultado da variavel");





       }



    }

