package com.example.app;

import com.example.datos.Bebida;
import com.example.datos.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministradorProductosTest {
    @Test
    public void main() {
        Producto p1 = new Bebida(101, "Gaseosa", 1500);
        assertEquals(p1.getDescuento(), 0.0);
        Producto p2 = new Bebida(102, "Cerveza", 3000);
        assertEquals(p2.getDescuento(), 0.0);
        assertEquals(getDescuento(4500), 900);
    }

    public double getDescuento(double precio) {
        return precio * 0.2d;
    }
}

