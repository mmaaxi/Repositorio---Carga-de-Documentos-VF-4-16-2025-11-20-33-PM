package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    private WebDriver driver;
    private By loginButton = By.id("login");
    private By unauthorizedUserCredentials = By.id("unauthorizedCreds");
    private By uploadButton = By.id("upload");
    private By errorMessageLocator = By.id("error-message");
    private By accessDeniedAlert = By.id("access-denied");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("https://example.com/login");
    }

    public void loginAsUnauthorizedUser() {
        driver.findElement(unauthorizedUserCredentials).click();
        driver.findElement(loginButton).click();
    }

    public boolean accessUploadFunctionality() {
        driver.findElement(uploadButton).click();
        return !driver.findElements(accessDeniedAlert).isEmpty();
    }

    public String getAccessDeniedMessage() {
        return driver.findElement(accessDeniedAlert).getText();
    }

    public void attemptDocumentUpload() {
        driver.findElement(uploadButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageLocator).getText();
    }
}