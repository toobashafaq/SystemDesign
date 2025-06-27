import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    public List<Observer> observers=new ArrayList<>();
    public String weather;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(weather);
        }

    }
    public void setWeather(String newWeather){
        this.weather=newWeather;
        notifyObserver();
    }
}
