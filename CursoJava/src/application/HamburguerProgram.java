package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pedido;

public class HamburguerProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in); 

        Pedido.exibirCardapio();

        // Cria um novo pedido
        Pedido pedido = new Pedido();
        
        System.out.print("Enter the number of items: "); 
        int numItems = sc.nextInt(); // Lê o número de itens
        sc.nextLine(); // Consome a nova linha após o número

        // Loop para ler os itens do pedido
        for (int i = 1; i <= numItems; i++) {
            System.out.printf("Item #%d:%n", i);
            System.out.print("Product name: "); 
            String nome = sc.nextLine(); 
            System.out.print("Product price: "); 
            double preco = sc.nextDouble(); 
            sc.nextLine(); // Consome a nova linha após o preço
            
            // Adiciona o item ao pedido
            pedido.adicionarItem(nome, preco);
        }

        pedido.exibirDetalhes();

        sc.close();
    }
}
