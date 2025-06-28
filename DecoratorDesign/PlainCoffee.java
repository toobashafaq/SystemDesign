public class PlainCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public Double getCost() {
        return 100.0;
    }
}
