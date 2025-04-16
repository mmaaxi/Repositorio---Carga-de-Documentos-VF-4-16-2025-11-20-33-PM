import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page progressBarPage;

    @Given("^El usuario ha iniciado la aplicación$")
    public void el_usuario_ha_iniciado_la_aplicacion() {
        // Inicializar driver y página
        progressBarPage = new tc_005Page(driver);
    }

    @When("^El usuario inicia la carga de un documento grande$")
    public void el_usuario_inicia_la_carga_de_un_documento_grande() {
        progressBarPage.startLargeDocumentUpload();
    }

    @Then("^Se muestra el indicador de progreso$")
    public void se_muestra_el_indicador_de_progreso() {
        progressBarPage.verifyProgressBarVisible();
    }

    @Given("^El indicador de progreso es visible$")
    public void el_indicador_de_progreso_es_visible() {
        progressBarPage.verifyProgressBarVisible();
    }

    @When("^El usuario observa el progreso durante la carga$")
    public void el_usuario_observa_el_progreso_durante_la_carga() {
        // Lógica para observar el progreso
    }

    @Then("^El indicador refleja el avance en tiempo real$")
    public void el_indicador_refleja_el_avance_en_tiempo_real() {
        progressBarPage.verifyProgressInRealTime();
    }
    
    @When("^Se completa la carga del documento$")
    public void se_completa_la_carga_del_documento() {
        progressBarPage.waitForUploadCompletion();
    }

    @Then("^El indicador llega al 100% y se notifica la finalización$")
    public void el_indicador_llega_al_100_por_ciento_y_se_notifica_la_finalizacion() {
        progressBarPage.verifyCompletionNotification();
    }
}