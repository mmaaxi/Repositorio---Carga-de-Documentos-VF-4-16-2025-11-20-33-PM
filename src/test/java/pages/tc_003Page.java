package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    WebDriver driver;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLargeDocument() {
        WebElement fileInput = driver.findElement(By.id("fileUpload"));
        fileInput.sendKeys("/path/to/large/document");
    }

    public void tryUploadDocument() {
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.click();
    }

    public boolean isDocumentTooLarge() {
        // Implementación que verifica si el documento es rechazado por ser demasiado grande
        return driver.getPageSource().contains("document too large");
    }

    public boolean isErrorMessageDisplayed(String expectedMessage) {
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        return errorMessage.isDisplayed() && errorMessage.getText().equals(expectedMessage);
    }
}