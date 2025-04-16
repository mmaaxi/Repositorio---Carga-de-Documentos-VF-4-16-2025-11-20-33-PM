package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_001Page;
import io.cucumber.java.en.*;

public class tc_001Steps {
    
    WebDriver driver;
    WebDriverWait wait;
    tc_001Page page;

    @Given("un usuario está en la página de carga de documentos")
    public void openDocumentUploadPage() {
        driver = new WebDriverManager().getDriver();
        wait = new WebDriverWait(driver, 10);
        page = new tc_001Page(driver, wait);
        page.navigateToUploadPage();
    }

    @When("selecciona un documento con formato soportado")
    public void selectSupportedDocument() {
        page.selectFile("document.pdf");  // Example file
    }

    @When("hace clic en el botón 'Cargar documento'")
    public void clickUploadButton() {
        page.clickUploadButton();
    }

    @Then("el sistema inicia el proceso de carga")
    public void verifyUploadProcessStarts() {
        page.verifyUploadStarts();
    }

    @Then("se muestra el indicador de progreso correctamente")
    public void verifyProgressIndicator() {
        page.verifyProgressIndicator();
    }

    @Then("muestra un mensaje de éxito al finalizar la carga")
    public void verifySuccessMessage() {
        page.verifySuccessMessage("Carga completada");
    }
}