package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // Lista para armazenar os itens do pedido
    private List<Item> itens;
    
    private double valorTotal;

    // Construtor da classe Pedido
    public Pedido() {
        this.itens = new ArrayList<>(); // Inicializa a lista de itens
        this.valorTotal = 0.0; // Inicializa o valor total como 0
    }

    // Classe interna para representar um item do pedido
    private static class Item {
        String nome; 
        double preco;

        // Construtor da classe Item
        Item(String nome, double preco) {
            this.nome = nome; // Inicializa o nome do item
            this.preco = preco; // Inicializa o preço do item
        }
    }

    // Método para adicionar um item ao pedido
    public void adicionarItem(String nome, double preco) {
        itens.add(new Item(nome, preco)); // Adiciona um novo item à lista
        valorTotal += preco; // Atualiza o valor total
    }

    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        return valorTotal; 
    }

    // Método para exibir os detalhes do pedido
    public void exibirDetalhes() {
        System.out.println("Resumo do Pedido:");
        for (Item item : itens) { // Itera sobre cada item na lista
            System.out.printf("%s, $ %.2f%n", item.nome, item.preco); // Exibe nome e preço do item
        }
        System.out.printf("Total: $ %.2f%n", valorTotal); 
    }

    // Método estático para exibir o cardápio
    public static void exibirCardapio() {
    	System.out.println 
    			 ("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\r\n"
                + "┗━Lanches:                    ┃\r\n"
                + "┃ 1. X-Bacon          ($10.00)┃\r\n"
                + "┃ 2. X-Salada          ($8.00)┃\r\n"
                + "┃ 3. X-Egg             ($9.00)┃\r\n"
                + "┗━Bebidas:                    ┃\r\n"
                + "┃ 1. Coca-Cola         ($5.00)┃\r\n"
                + "┃ 2. Pepsi             ($4.50)┃\r\n"
                + "┃ 3. Suco Natural      ($6.00)┃\r\n"
                + "┗━Acompanhamentos:            ┃\r\n"
                + "┃ 1. Batata Frita      ($3.50)┃\r\n"
                + "┃ 2. Onion Rings       ($4.00)┃\r\n"
                + "┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\r\n");
    }
}

