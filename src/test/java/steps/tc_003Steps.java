package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("que el usuario ha seleccionado un documento cuyo tamaño excede el límite permitido")
    public void queElUsuarioHaSeleccionadoUnDocumentoCuyoTamañoExcedeElLímitePermitido() {
        page.selectLargeDocument();
    }

    @When("intenta cargar el documento")
    public void intentaCargarElDocumento() {
        page.tryUploadDocument();
    }

    @Then("el sistema debe identificar que el tamaño es superior al permitido")
    public void elSistemaDebeIdentificarQueElTamañoEsSuperiorAlPermitido() {
        Assert.assertTrue(page.isDocumentTooLarge());
    }

    @Then("se muestra un mensaje de error: 'Archivo demasiado grande'")
    public void seMuestraUnMensajeDeErrorArchivoDemasiadoGrande() {
        Assert.assertTrue(page.isErrorMessageDisplayed("Archivo demasiado grande"));
    }
}