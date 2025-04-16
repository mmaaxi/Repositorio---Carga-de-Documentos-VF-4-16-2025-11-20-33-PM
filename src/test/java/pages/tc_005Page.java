import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;

    By progressBar = By.id("progress-bar");
    By uploadButton = By.id("upload-button");
    By completionNotification = By.id("completion-notification");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void startLargeDocumentUpload() {
        driver.findElement(uploadButton).click();
    }

    public void verifyProgressBarVisible() {
        driver.findElement(progressBar).isDisplayed();
    }

    public void verifyProgressInRealTime() {
        // Lógica para verificar el progreso en tiempo real (simulación)
    }
    
    public void waitForUploadCompletion() {
        // Lógica para esperar que la carga se complete (p.ej., espera explícita)
    }

    public void verifyCompletionNotification() {
        driver.findElement(completionNotification).isDisplayed();
    }
}