package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {

    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By documentList = By.id("documentList");
    private By documentDetails = By.cssSelector("div.document-details");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void subirDocumento() {
        WebElement uploadElement = driver.findElement(uploadButton);
        // Código para seleccionar y cargar el documento se añade aquí
        uploadElement.sendKeys("/path/to/document");
    }

    public boolean esDocumentoVisibleEnLista() {
        return driver.findElement(documentList).isDisplayed();
    }

    public boolean verificarDetallesDocumento() {
        WebElement detailsElement = driver.findElement(documentDetails);
        // Código para verificar el nombre, formato y tamaño del documento
        String expectedName = "documento.txt";
        String expectedFormat = "txt";
        String expectedSize = "1MB";
        
        // Lógica para verificar los detalles del documento
        return detailsElement.getText().contains(expectedName) &&
               detailsElement.getText().contains(expectedFormat) &&
               detailsElement.getText().contains(expectedSize);
    }
}