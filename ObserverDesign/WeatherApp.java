public class WeatherApp {
    public static void main(String[] args){
        WeatherStation weatherStation= new WeatherStation();
        Observer phoneDisplay=new PhoneDisplay();
        Observer TVdisplay=new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(TVdisplay);

        weatherStation.setWeather("Sunny");
    }
}
