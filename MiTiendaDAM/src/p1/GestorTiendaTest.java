package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {
    static GestorTienda gestorTienda;

    @BeforeAll
    static void setUpBeforeClass() {
        gestorTienda = new GestorTienda();
    }

    @Test
    void testCalcularDescuento() {
        assertEquals(10.0, gestorTienda.calcularDescuento(100, 10));
        assertEquals(5.0, gestorTienda.calcularDescuento(100, 5));
        assertEquals(0.0, gestorTienda.calcularDescuento(100, 2));
    }

    @Test
    void testCategorizarProducto() {
        assertEquals("Económico", gestorTienda.categorizarProducto(9));
        assertEquals("Estándar", gestorTienda.categorizarProducto(30));
        assertEquals("Premium", gestorTienda.categorizarProducto(100));
    }

    @Test
    void testBuscarProducto() {
        String[] inventario = {"Portatil", "Raton", "Teclado"};
        assertEquals("Raton", gestorTienda.buscarProducto(inventario, "Raton"));
        assertNull(gestorTienda.buscarProducto(inventario, "Monitor"));
        assertTrue(gestorTienda.buscarProducto(inventario, "Portatil") != null);
    }
}
