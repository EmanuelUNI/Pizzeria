/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pedido;

import core.pizzeria.Cliente;
import core.pizzeria.Item;
import java.util.ArrayList;

/**
 *
 * @author esiachoque
 */
public abstract class Pedido {
    protected Cliente cliente;
    protected ArrayList<Item> items;

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }
    
}
