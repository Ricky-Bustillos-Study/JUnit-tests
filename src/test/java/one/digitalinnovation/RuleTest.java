package one.digitalinnovation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    // Declaração de objeto TemporaryFolder
    // Toda Rule será executada antes dos testes
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        // Criando arquivo dentro da pasta temporária
        File created = tmpFolder.newFile("file.txt");

        // Verificar se arquivo foi criado
        assertTrue(created.isFile());

        // Verificar se são iguais
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }

}
