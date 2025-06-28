public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decorateCoffee) {
        super(decorateCoffee);
    }
    @Override
    public String getDescription(){
        return decorateCoffee.getDescription() + ", Milk";
    }

    @Override
    public Double getCost(){
        return decorateCoffee.getCost() + 50;
    }
}
