public class Main {
    public static void main(String[] args) {
//        Plain Coffee
        Coffee coffee = new PlainCoffee();
        System.out.println("Description : " + coffee.getDescription());
        System.out.println("Cost : " + coffee.getCost());


        //Coffee with milk
        Coffee milkCoff = new MilkDecorator(new PlainCoffee());
        System.out.println("Description : " + milkCoff.getDescription());
        System.out.println("Cost : " + milkCoff.getCost());


    //Coffee with milk and sugar
        Coffee sugarMilkCoffee=new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("Description : " + sugarMilkCoffee.getDescription());
        System.out.println("Cost : "+sugarMilkCoffee.getCost());

}
}
