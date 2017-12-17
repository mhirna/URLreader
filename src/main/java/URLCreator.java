
public class URLCreator {
    private String city;
    private String APPId;
    private String URL = "http://api.openweathermap.org/data/2.5/weather";

    public URLCreator(String city, String APPId){
        this.city = city;
        this.APPId = APPId;
    }

    public String createURL(){
        return URL + "?q=" + city + "&appid=" + APPId;
    }
}
