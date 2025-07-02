import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> slots;

    public ParkingFloor(int floorNumber, List<ParkingSlot> slots) {
        this.floorNumber = floorNumber;
        this.slots = slots;
    }

    public void addSlot(ParkingSlot slot){
        slots.add(slot);
    }

    public ParkingSlot getFreeSlot(VehicleType type){
        for(ParkingSlot slot: slots){
            if(slot.getSupportedType()==type && !slot.isOccupied()){
                return slot;
            }
        }
        return null;
    }
    public Map<VehicleType,Long> getFreeSlotCountByType(){
        Map<VehicleType,Long> countMap = new HashMap<>();
        for(ParkingSlot slot:slots){
            if(!slot.isOccupied()){
                countMap.put(slot.getSupportedType(),countMap.getOrDefault(slot.getSupportedType(),0L)+1);

            }
        }
        return countMap;
    }
}
