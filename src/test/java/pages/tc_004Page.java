package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import utils.DriverFactory;

public class tc_004Page {
    WebDriver driver = DriverFactory.getDriver();

    public void seleccionarDocumentoCargado() {
        WebElement documento = driver.findElement(By.id("documentoExistente"));
        documento.click();
    }

    public void cargarDocumento() {
        WebElement botonCargar = driver.findElement(By.id("botonCargar"));
        botonCargar.click();
    }

    public boolean verificarAdvertenciaDuplicado() {
        Alert alerta = driver.switchTo().alert();
        String mensajeAlerta = alerta.getText();
        alerta.accept();
        return mensajeAlerta.contains("Documento duplicado");
    }
}