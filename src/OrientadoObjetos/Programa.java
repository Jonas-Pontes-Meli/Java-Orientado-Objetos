package OrientadoObjetos;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static ArrayList<Produto> listProdutos = new ArrayList<Produto>();

    public static void main(String[] args) {
        Produto produtos = new Produto();
        Scanner leia = new Scanner(System.in);
        Programa pg = new Programa();

        String nome;
        float preco;
        float peso;
        float volume;
        for (int i =0; i<= 2; i++) {
            System.out.println("Digite o Nome do Produto :");
            nome = leia.next();
            System.out.println("Digite o Preço do Produto :");
            preco = leia.nextFloat();
            System.out.println("Digite o Peso do Produto :");
            peso = leia.nextFloat();
            System.out.println("Digite o Volume do Produto :");
            volume = leia.nextFloat();
            pg.adicionaProduto(nome,preco,peso,volume);


        }
        //foreach usando lambda
           listProdutos.forEach(produto -> {
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());
            System.out.println(produto.getPeso());
            System.out.println(produto.getVolume());
        });
        //outra forma de fazer um foreach
        for (Produto produto:listProdutos)
        {
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());
            System.out.println(produto.getPeso());
            System.out.println(produto.getVolume());
        }
    }
    public void  adicionaProduto(String nome, float preco, float peso, float volume)
    {
        Programa pg = new Programa();
        Produto produto = new Produto();
        produto.nome = nome;
        produto.preco = preco;
        produto.peso = peso;
        produto.volume = volume;
        pg.listProdutos.add(produto);
    }

}
