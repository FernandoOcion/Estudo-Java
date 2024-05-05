package com.example.lanchonete;

// Classe principal
public class Lanchonete {

    public static void main(String[] args) {
        // Cria alguns itens do menu
        ItemMenu item1 = new ItemMenu("X-Tudo", 10.0);
        ItemMenu item2 = new ItemMenu("Refrigerante", 5.0);

        // Cria um pedido
        Pedido pedido = new Pedido();

        // Adiciona itens ao pedido
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        // Calcula o total do pedido
        double total = pedido.calcularTotal();

        // Imprime o total do pedido
        System.out.println("Total do pedido: " + total);
    }

}