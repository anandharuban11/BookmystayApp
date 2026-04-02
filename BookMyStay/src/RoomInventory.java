

public class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single", 10);
        roomAvailability.put("Double", 8);
        roomAvailability.put("Deluxe", 5);
        roomAvailability.put("Suite", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return Collections.unmodifiableMap(roomAvailability);
    }

    public void updateAvailability(String roomType, int count) {
        if (count < 0) {
            throw new IllegalArgumentException();
        }
        roomAvailability.put(roomType, count);
    }

    public boolean bookRoom(String roomType) {
        if (!roomAvailability.containsKey(roomType)) return false;

        int available = roomAvailability.get(roomType);
        if (available > 0) {
            roomAvailability.put(roomType, available - 1);
            return true;
        }
        return false;
    }

    public void cancelBooking(String roomType) {
        if (!roomAvailability.containsKey(roomType)) return;

        roomAvailability.put(roomType, roomAvailability.get(roomType) + 1);
    }

    public static void main(String[] args) {
        RoomInventory inventory = new RoomInventory();

        System.out.println(inventory.getRoomAvailability());

        inventory.bookRoom("Single");
        System.out.println(inventory.getRoomAvailability());

        inventory.cancelBooking("Single");
        System.out.println(inventory.getRoomAvailability());
    }
}