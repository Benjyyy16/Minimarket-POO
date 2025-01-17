/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseprincipal;

import java.util.ArrayList;

public class Minimarket {
    
private ArrayList<Producto> inventario = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void eliminarProductoPorCodigo(String Códigodelproducto) {
    
    }

    public Producto buscarProductoPorCodigo(String Códigodelproducto) {
        
        return null;
    }

    public ArrayList<Producto> getLacteos() {
       
        return null;
    }

    public ArrayList<Producto> getPasta() {
       
        return null;
    }

    public void mostrarProductos() {
        System.out.println("Inventario de productos:");
        System.out.println("--------------------------------------------");

        for (Producto producto : inventario) {
            System.out.println("Código del producto: " + producto.getCodigoproducto());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Peso: " + producto.getPeso());
            System.out.println("Tipo: " + producto.getTipo());
            System.out.println("--------------------------------------------");
        }
    }
}
    

    
    
    
    
    

