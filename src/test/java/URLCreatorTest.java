import org.junit.Test;

import static org.junit.Assert.*;

public class URLCreatorTest {
    URLCreator urlTest = new URLCreator("London", "5496614f4ca95e6dcc0445c1e7f3916d");
    String correctUrl = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=5496614f4ca95e6dcc0445c1e7f3916d";

    @Test
    public void createURL() throws Exception {
        assertTrue(urlTest.createURL().equals(correctUrl.toString()));
        }

}