package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingpage {
    private WebDriver driver;
    private By linktext1 = By.linkText("Example 1: Element on page that is hidden");
    private By linktext2 = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingpage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExamplePage clickExample() {
        driver.findElement(linktext1).click();
        return new DynamicLoadingExamplePage(driver);
    }


}
