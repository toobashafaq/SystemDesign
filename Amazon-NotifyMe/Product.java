import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    String productName;
    boolean instock;
    private List<Observer> observers=new ArrayList<>();


    public  Product(String productName){
        this.productName=productName;
        this.instock=false;
    }

    public void setInstock(boolean instock){
        this.instock=instock;
        if(instock){
            notifyObservers();
        }
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o :observers){
            o.update(productName);
        }
    }
}
