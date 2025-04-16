package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.tc_007Page;
import static org.junit.Assert.assertTrue;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("El usuario ha cargado un documento válido")
    public void cargarDocumentoValido() {
        page.subirDocumento();
    }

    @Then("El documento aparece en la lista de documentos cargados")
    public void verificarDocumentoEnLista() {
        assertTrue(page.esDocumentoVisibleEnLista());
    }

    @Then("Los detalles del documento \\(nombre, formato, tamaño) se muestran correctamente")
    public void verificarDetallesDelDocumento() {
        assertTrue(page.verificarDetallesDocumento());
    }
}