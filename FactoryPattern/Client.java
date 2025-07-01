public class Client {
    private Vehicle pVehicle;

    public Client(VehicleFactory factory){
        pVehicle=factory.createVehicle();
    }

    public Vehicle getpVehicle() {
        return pVehicle;
    }
}
