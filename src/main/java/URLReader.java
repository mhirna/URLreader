import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.net.*;
import java.io.*;


public class URLReader {
    private String url;
    public URLReader(String url){
        this.url = url;
    }

    public JSONObject readURL() throws IOException, ParseException {
        URL verisign = new URL(this.url);
        BufferedReader in = new BufferedReader(new InputStreamReader(verisign.openStream()));
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(in.readLine());
        in.close();
        return json;
    }
}
