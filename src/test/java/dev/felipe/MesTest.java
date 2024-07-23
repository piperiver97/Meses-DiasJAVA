package dev.felipe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MesTest {

    @Test
    public void testGetNombreDelMes() {
        assertEquals("Enero", Mes.getNombreDelMes(1));
        assertEquals("Febrero", Mes.getNombreDelMes(2));
        assertEquals("Marzo", Mes.getNombreDelMes(3));
        assertEquals("Abril", Mes.getNombreDelMes(4));
        assertEquals("Mayo", Mes.getNombreDelMes(5));
        assertEquals("Junio", Mes.getNombreDelMes(6));
        assertEquals("Julio", Mes.getNombreDelMes(7));
        assertEquals("Agosto", Mes.getNombreDelMes(8));
        assertEquals("Septiembre", Mes.getNombreDelMes(9));
        assertEquals("Octubre", Mes.getNombreDelMes(10));
        assertEquals("Noviembre", Mes.getNombreDelMes(11));
        assertEquals("Diciembre", Mes.getNombreDelMes(12));
    }

    @Test
    public void testGetDiasDelMes() {
        assertEquals(31, Mes.getDiasDelMes(1));
        assertEquals(28, Mes.getDiasDelMes(2));
        assertEquals(31, Mes.getDiasDelMes(3));
        assertEquals(30, Mes.getDiasDelMes(4));
        assertEquals(31, Mes.getDiasDelMes(5));
        assertEquals(30, Mes.getDiasDelMes(6));
        assertEquals(31, Mes.getDiasDelMes(7));
        assertEquals(31, Mes.getDiasDelMes(8));
        assertEquals(30, Mes.getDiasDelMes(9));
        assertEquals(31, Mes.getDiasDelMes(10));
        assertEquals(30, Mes.getDiasDelMes(11));
        assertEquals(31, Mes.getDiasDelMes(12));
    }

    @Test
    public void testMesInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            Mes.getNombreDelMes(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Mes.getNombreDelMes(13);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Mes.getDiasDelMes(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Mes.getDiasDelMes(13);
        });
    }
}
