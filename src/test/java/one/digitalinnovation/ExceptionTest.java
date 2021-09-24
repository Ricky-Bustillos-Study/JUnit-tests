package one.digitalinnovation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExceptionTest {

    // Esperado que ocorra uma exceção
    @Test(expected = IndexOutOfBoundsException.class)
    public void empty() {
        new ArrayList<Object>().get(0);
    }

    // Também é esperado que ocorra uma exceção
    @Test(expected = IndexOutOfBoundsException.class)
    public void empty2() {
        List<String> lista = new ArrayList<String>();
        // lista.add("Ricky");
        lista.get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index 0 out of bounds for length 0");

        list.get(0);
    }

    @Test
    public void testExceptionMessage() {
        try {
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutOfBoundsException seja lançada");
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
