package Http;

import OrientadoObjetos.Programa;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ProgramaHttp {
    public static ClientHttp service = new ClientHttp();
    public static Scanner leia = new Scanner(System.in);
    Programa pg = new Programa();
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException
    {
        int option;
        System.out.println("Menu Cadastro Produto" +
                "\n Opções" +
                "\n Digite : 1 para adicionar um novo Produto" +
                "\n Digite : 2 para editar um Produto" +
                "\n Digite : 3 para deletar um Produto" +
                "\n Digite : 4 para Buscar todos os Produtos");
        option = leia.nextInt();
        switch (option)
        {
            case 1 : add();
            case 2 : update();
            case 3 : delete();
            case 4 : select();
        }
    }
    public static void add() throws URISyntaxException, IOException, InterruptedException
    {
        String nome;
        float preco;
        float peso;
        float volume;
        boolean validador = true ;
        while (validador)
        {
            System.out.println("Digite o Nome do Produto :");
            nome = leia.next();
            System.out.println("Digite o Preço do Produto :");
            preco = leia.nextFloat();
            System.out.println("Digite o Peso do Produto :");
            peso = leia.nextFloat();
            System.out.println("Digite o Volume do Produto :");
            volume = leia.nextFloat();
            service.PostProduto(nome, peso, preco, volume);
            System.out.println("Deseja adicionar outro Produto? \n" +
                    "Digite S/N");
            if(leia.toString().equalsIgnoreCase("N"))
            {
                System.exit(1);
                validador = false;
            }
            else
            {
                continue;
            }
        }
    }
    public static void update() throws URISyntaxException, IOException, InterruptedException
    {
        String nome,key;
        float preco;
        float peso;
        float volume;
            System.out.println("Digite o id do Produto :");
            key = leia.next();
            System.out.println("Digite o Nome do Produto :");
            nome = leia.next();
            System.out.println("Digite o Preço do Produto :");
            preco = leia.nextFloat();
            System.out.println("Digite o Peso do Produto :");
            peso = leia.nextFloat();
            System.out.println("Digite o Volume do Produto :");
            volume = leia.nextFloat();
            service.PutProduto(key,nome, peso, preco, volume);

    }
    public static void delete() throws URISyntaxException, IOException, InterruptedException
    {
        String key;
        System.out.println("Digite o Nome do Produto :");
        key = leia.next();
        service.deleteProduto(key);
    }

    public static void select() throws URISyntaxException, IOException, InterruptedException
    {
        service.getProduto();
    }

}
