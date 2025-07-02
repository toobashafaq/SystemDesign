public class ParkingSlot {
    private String slotId;
    private VehicleType supportedType;
    private boolean occupied;
    private Vehicle parkedVehicle;

    public ParkingSlot(String slotId,VehicleType supportedType){
        this.slotId=slotId;
        this.supportedType=supportedType;
        this.occupied=false;
    }

    public boolean isAvailableFor(Vehicle vehicle){
        return !occupied && vehicle.getType()==supportedType;
    }

    public void assignedVehicle(Vehicle v){
        this.parkedVehicle=v;
        this.occupied=true;
    }
    public void removeVehicle(){
        this.parkedVehicle=null;
        this.occupied=false;
    }
    public VehicleType getSupportedType(){
        return supportedType;
    }

    public boolean isOccupied(){
        return occupied;
    }
}
