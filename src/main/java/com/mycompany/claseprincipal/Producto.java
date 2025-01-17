/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseprincipal;


public class Producto {

  private String codigoproducto;
    private String nombre;
    private double precio;
    private double peso;
    private String tipo;

    public Producto(String codigoproducto, String nombre, double precio, double peso, String tipo) {
        this.codigoproducto = codigoproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }
}
    

    
    
    
      
    
    
 


    
    

