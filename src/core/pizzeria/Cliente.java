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
public class Cliente {
    private String nombre;
    private ArrayList<Pedido>pedidos;
    
    public Cliente(String nombre){
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }
}
