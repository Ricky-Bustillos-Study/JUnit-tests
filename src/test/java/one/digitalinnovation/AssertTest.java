package one.digitalinnovation;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    // Teste para verificar Arrays
    @Test
    public void testAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual =  "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    // Teste para verificar Strings
    @Test
    public void testAssertEquals() {
        assertEquals("text", "text");
    }

    // Teste para condições com retorno booleano
    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    // Teste para verificar se objeto não é nulo
    @Test
    public void testAssertNotNull() {
        assertNotNull(new Object());
    }

    // Teste para verificar se objeto é nulo
    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    // Verifica se o objeto é o mesmo
    @Test
    public void testAssertSame() {
        Integer number = Integer.valueOf(768);
        assertSame(number, number);
    }



}
