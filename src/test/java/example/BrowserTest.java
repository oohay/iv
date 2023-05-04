package example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BrowserTest {
    @Test
    public void testPeek() {
        Browser foo = new Browser();
        foo.add("bar");
        assertEquals("bar", foo.getUrls().get(0));
    }
}
