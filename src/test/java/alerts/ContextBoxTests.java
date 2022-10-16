package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextBoxTests extends BaseTests {
    @Test
    public void checkContextMenu() {
        var context = homePage.clickContextMenu();
        context.rightClickOnContextBox();
        String text = context.getTextInTheAlert();
        assertEquals(text, "You selected a context menu", "Text is Wrong");
    }

    @Test
    public void acceptAlertMessage() {
        var context = homePage.clickContextMenu();
        context.rightClickOnContextBox();
        context.acceptAlert();
    }
}
