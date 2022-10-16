package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        var text = alertPage.getAlertMessageResult();
        assertEquals(text, "You successfully clicked an alert", "The text is not correct");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirmMessage();
        String text = alertPage.getAlertConfirmMessage();
        alertPage.dismissConfirmMessage();
        assertEquals(text, "I am a JS Confirm", "Wrong text");
    }

    @Test
    public void testInputInAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.clickJSPromptButton();
        alertPage.setAlertPromptField("TAU rocks");
        alertPage.acceptAlert();
        String text = alertPage.getAlertMessageResult();
        assertEquals(text, "You entered: TAU rocks", "Wrong text");
    }
}
