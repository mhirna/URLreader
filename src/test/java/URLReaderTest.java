import org.junit.Test;

import static org.junit.Assert.*;

public class URLReaderTest {
    URLCreator urlTest = new URLCreator("London", "5496614f4ca95e6dcc0445c1e7f3916d");
    URLReader read = new URLReader(urlTest.createURL());
    @Test
    public void readURL() throws Exception {
        System.out.println(read.readURL().toString());
    }

}