import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParametersTest {

    URLCreator urlTest = new URLCreator("London", "5496614f4ca95e6dcc0445c1e7f3916d");
    Parameters testParameters = new Parameters(urlTest.createURL());

    public ParametersTest() throws IOException, ParseException {
    }

    @Test
    public void getDescription() throws Exception {
        System.out.println(testParameters.getDescription());
    }

    @Test
    public void getTempKelvin() throws Exception {
        System.out.println(testParameters.getTempKelvin());
    }

    @Test
    public void getTempCelsium() throws Exception {
    assertTrue(testParameters.getTempKelvin() - testParameters.getTempCelsium() == 273.15);
    }


}