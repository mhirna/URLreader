import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;

public class Parameters {
    JSONObject info;
    public Parameters(String url) throws IOException, ParseException {
        URLReader urlReader = new URLReader(url);
        info = urlReader.readURL();
    }

    public String getDescription(){
        JSONObject json = (JSONObject) ((ArrayList) info.get("weather")).get(0);
        return (String) json.get("description");
    };

    public Double getTempKelvin(){
        JSONObject json = (JSONObject) info.get("main");
        return (Double) json.get("temp");
    };

    public Double getTempCelsium(){
        return getTempKelvin() - 273.15;
    };
}
