/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pizzeria;

import core.pedido.Pedido;
import java.util.ArrayList;

/**
 *
 * @author esiachoque
 */
public class Pizzeria {
    private String nombre;
    private ArrayList<Cliente>clientes;
    private ArrayList<Item>items;
    private ArrayList<Pedido>pedidos;

    public Pizzeria(String nombre, ArrayList<Cliente> clientes, ArrayList<Item> items, ArrayList<Pedido> pedidos) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.items = items;
        this.pedidos = pedidos;
    }
}
