package com.example.app;

import com.example.datos.Bebida;
import com.example.datos.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministradorProductosTest {
    @Test
    public void main() {
        Producto p = new Bebida(104, "Té", 1800);
        assertEquals(p.getDescuento(), 0.0);
    }
}

