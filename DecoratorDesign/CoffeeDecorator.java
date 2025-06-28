public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decorateCoffee;

    public CoffeeDecorator(Coffee decorateCoffee){
        this.decorateCoffee=decorateCoffee;
    }

    @Override
    public String getDescription(){
        return decorateCoffee.getDescription();
    }

    @Override
    public Double getCost(){
        return decorateCoffee.getCost();
    }

}
