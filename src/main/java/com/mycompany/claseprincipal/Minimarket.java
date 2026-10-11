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

    public boolean eliminarProductoPorCodigo(String codigo) {
        return inventario.removeIf(producto -> producto.getCodigoproducto().equals(codigo));
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : inventario) {
            if (producto.getCodigoproducto().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public ArrayList<Producto> getPorTipo(String tipo) {
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto producto : inventario) {
            if (producto.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(producto);
            }
        }
        return resultado;
    }

    public ArrayList<Producto> getLacteos() {
        return getPorTipo("Lácteos");
    }

    public ArrayList<Producto> getPasta() {
        return getPorTipo("Pastas");
    }

    public int cantidadProductos() {
        return inventario.size();
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
    

    
    
    
    
    

