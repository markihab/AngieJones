package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTestss extends BaseTests {
    @Test
    public void scrollToTableTest() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
