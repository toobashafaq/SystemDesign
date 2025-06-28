public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decorateCoffee) {
        super(decorateCoffee);
    }

    public String getDescription(){
        return decorateCoffee.getDescription() + " Sugar";
    }
    public Double getCost(){
        return decorateCoffee.getCost() + 20;
    }
}
