package com.mycompany.claseprincipal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimarketTest {

    private Minimarket minimarket;

    @BeforeEach
    void setUp() {
        minimarket = new Minimarket();
        minimarket.agregarProducto(new Producto("L1", "Leche", 1200, 1.0, "Lácteos"));
        minimarket.agregarProducto(new Producto("L2", "Yogurt", 500, 0.2, "Lácteos"));
        minimarket.agregarProducto(new Producto("P1", "Spaghetti", 900, 0.4, "Pastas"));
        minimarket.agregarProducto(new Producto("B1", "Agua", 700, 1.5, "Bebidas"));
    }

    @Test
    void buscaProductoPorCodigo() {
        assertEquals("Leche", minimarket.buscarProductoPorCodigo("L1").getNombre());
        assertNull(minimarket.buscarProductoPorCodigo("X9"));
    }

    @Test
    void eliminaProductoPorCodigo() {
        assertTrue(minimarket.eliminarProductoPorCodigo("B1"));
        assertNull(minimarket.buscarProductoPorCodigo("B1"));
        assertEquals(3, minimarket.cantidadProductos());
        assertFalse(minimarket.eliminarProductoPorCodigo("B1"));
    }

    @Test
    void filtraLacteosYPastas() {
        assertEquals(2, minimarket.getLacteos().size());
        assertEquals(1, minimarket.getPasta().size());
        assertEquals("Spaghetti", minimarket.getPasta().get(0).getNombre());
    }

    @Test
    void filtrosNuncaDevuelvenNull() {
        Minimarket vacio = new Minimarket();
        assertNotNull(vacio.getLacteos());
        assertTrue(vacio.getPasta().isEmpty());
    }
}
