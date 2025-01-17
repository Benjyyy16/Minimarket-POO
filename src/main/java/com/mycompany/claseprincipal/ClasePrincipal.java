/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



//benjaminaguilar
package com.mycompany.claseprincipal;

import java.util.Scanner;



public class ClasePrincipal {

    public static void main(String[] args) {
       
         Minimarket minimarket = new Minimarket();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Ingrese los datos del producto " + i + ":");
            
            System.out.print("Código del producto: ");
            String codigo = scanner.next();
            
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            
            double precio = 0;
            while (precio <= 0) {
                System.out.print("Precio (debe ser mayor que 0): ");
                precio = scanner.nextDouble();
            }
            
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            
            String tipo = "";
            while (!tipo.matches("Lácteos|Bebidas|Carnes|Pastas")) {
                System.out.print("Tipos (Lácteos, Bebidas, Carnes, Pastas): ");
                tipo = scanner.next();
            }
            
            Producto producto = new Producto(codigo, nombre, precio, peso, tipo);
            minimarket.agregarProducto(producto);
        }
        
        
         minimarket.mostrarProductos();
        
    }
}
