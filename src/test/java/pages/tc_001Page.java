package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_001Page {
    
    private WebDriver driver;
    private WebDriverWait wait;

    private By fileInput = By.id("file-upload");
    private By uploadButton = By.id("upload-button");
    private By progressIndicator = By.id("progress-indicator");
    private By successMessage = By.id("success-message");

    public tc_001Page(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void selectFile(String fileName) {
        WebElement fileInputElement = wait.until(ExpectedConditions.elementToBeClickable(fileInput));
        fileInputElement.sendKeys(System.getProperty("user.dir") + "/resources/" + fileName);
    }

    public void clickUploadButton() {
        wait.until(ExpectedConditions.elementToBeClickable(uploadButton)).click();
    }

    public void verifyUploadStarts() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(progressIndicator));
    }

    public void verifyProgressIndicator() {
        WebElement progress = wait.until(ExpectedConditions.visibilityOfElementLocated(progressIndicator));
        assert(progress.isDisplayed());
    }

    public void verifySuccessMessage(String expectedMessage) {
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        assert(message.getText().equals(expectedMessage));
    }
}