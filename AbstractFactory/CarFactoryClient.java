public class CarFactoryClient {
    public static void main(String[] args) {
        CarFactory northAmericaCarFactory=new NorthAmericaCarFactory();
        Car northAmericaCar= (Car) northAmericaCarFactory.createCar();
        CarSpecification northAmericaSpec=northAmericaCarFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        CarFactory europeFactory = (CarFactory) new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
    }
