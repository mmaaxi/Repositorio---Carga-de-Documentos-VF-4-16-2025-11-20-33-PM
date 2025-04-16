package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By fileInput = By.id("fileUploadInput");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectUnsupportedDocument(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isDocumentRejected() {
        return driver.findElements(errorMessage).size() > 0;
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}