package steps;

import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("que el sistema de carga de documentos está disponible")
    public void que_el_sistema_de_carga_de_documentos_Esta_disponible() {
        // Lógica para verificar que el sistema está disponible
        assertTrue(page.isSystemAvailable());
    }

    @When("se realizan cambios o actualizaciones al sistema de carga de documentos")
    public void se_realizan_cambios_o_actualizaciones_al_sistema_de_carga_de_documentos() {
        page.performSystemUpdate();
    }

    @Then("el sistema sigue funcionando sin errores")
    public void el_sistema_sigue_funcionando_sin_errores() {
        assertTrue(page.isSystemFunctioningCorrectly());
    }

    @When("ejecuto la suite completa de pruebas de carga de documentos")
    public void ejecuto_la_suite_completa_de_pruebas_de_carga_de_documentos() {
        page.runFullTestSuite();
    }

    @Then("todos los casos de prueba se ejecutan exitosamente sin romper funcionalidades existentes")
    public void todos_los_casos_de_prueba_se_ejecutan_exitosamente() {
        assertTrue(page.allTestsPassed());
    }
}