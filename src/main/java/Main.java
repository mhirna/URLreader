import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        String APPId = "5496614f4ca95e6dcc0445c1e7f3916d";
        String city = "Lviv";
        URLCreator urlCreate = new URLCreator(city, APPId);
        String url = urlCreate.createURL();
        Parameters params = new Parameters(url);

        System.out.println("The weather in " + city + " is " + params.getDescription() + "!");
        System.out.println("The temperature in Kelvin would be: " + params.getTempKelvin());
        System.out.println("The temperature in Celsium would be: " + params.getTempCelsium());

    }

}
