package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By submitFile = By.id("file-submit");
    private By fileName = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadTheFile(String absolutePathOfFile) {
        driver.findElement(chooseFile).sendKeys(absolutePathOfFile);
        //clickSubmitFileButton();
    }

    public void clickSubmitFileButton() {
        driver.findElement(submitFile).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(fileName).getText();
    }
}
