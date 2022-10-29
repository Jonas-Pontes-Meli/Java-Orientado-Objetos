package Basico;

public class Array_Simples {
    public static void main(String[] args) {

        int[] array = new int[2];
        array[0] = 1;
        array[1] = 2;
// o metodo length in dica a extensão ou o tamanho Ex: pode indicar "se I < que Array.seu tamanho"
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        switch (array.length) {
            case 1:
                System.out.println("possui o 1");
                break;
            case 2:
                System.out.println("possui o2");
                break;
            case 3:
                System.out.println("possui o 3");
                break;
            case 4:
                System.out.println("possui o 4");
                break;
        }
    }
}
