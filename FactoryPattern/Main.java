public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory=new TwoWheelerFactory();
        Client twoWheelerClient=new Client(twoWheelerFactory);
        Vehicle twoWheeler=twoWheelerClient.getpVehicle();
        twoWheeler.printVehicle();


        VehicleFactory fourWheelerFactory=new FourWheelerFactory();
        Client fourWheelerClient=new Client(fourWheelerFactory);
        Vehicle fourWheeler =fourWheelerClient.getpVehicle();
        fourWheeler.printVehicle();
    }
}
