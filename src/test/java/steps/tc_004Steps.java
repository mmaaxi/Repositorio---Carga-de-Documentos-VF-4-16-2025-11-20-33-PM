package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_004Page;
import static org.junit.Assert.assertTrue;

public class tc_004Steps {
    tc_004Page page = new tc_004Page();

    @Given("que selecciono un documento que ya ha sido cargado previamente")
    public void seleccionarDocumentoPreviamenteCargado() {
        page.seleccionarDocumentoCargado();
    }

    @When("intento cargar nuevamente el mismo documento")
    public void intentarCargarDocumentoDuplicado() {
        page.cargarDocumento();
    }

    @Then("el sistema muestra una advertencia de 'Documento duplicado'")
    public void validarAdvertenciaDocumentoDuplicado() {
        assertTrue("Advertencia de documento duplicado no mostrada", 
                   page.verificarAdvertenciaDuplicado());
    }
}