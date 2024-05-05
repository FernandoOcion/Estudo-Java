package com.example.lanchonete;

import java.util.ArrayList;
import java.util.List;

// Classe que representa um pedido
public class Pedido {

    public List<ItemMenu> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemMenu item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemMenu item : itens) {
            total += item.getPreco();
        }
        return total;
    }

}