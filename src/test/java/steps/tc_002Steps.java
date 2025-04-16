package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page page;

    @Dado("que el usuario tiene un documento con formato no soportado")
    public void que_el_usuario_tiene_un_documento_con_formato_no_soportado() {
        driver = new ChromeDriver();
        page = new tc_002Page(driver);
        driver.get("URL_DE_LA_APLICACION");
    }

    @Cuando("el usuario selecciona el documento con formato no soportado")
    public void el_usuario_selecciona_el_documento_con_formato_no_soportado() {
        page.selectUnsupportedDocument("ruta/al/documento.exe");
    }

    @Cuando("hace clic en el botón {string}")
    public void hace_clic_en_el_botón_cargar_documento(String button) {
        page.clickUploadButton();
    }

    @Entonces("el sistema rechaza el documento")
    public void el_sistema_rechaza_el_documento() {
        assertTrue(page.isDocumentRejected());
    }

    @Entonces("muestra un mensaje de error relacionado con el formato")
    public void muestra_un_mensaje_de_error_relacionado_con_el_formato() {
        assertTrue(page.isErrorMessageDisplayed());
        driver.quit();
    }
}