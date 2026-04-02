public class RoomAllocationService {

    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();
        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.get(roomType) != null && availability.get(roomType) > 0) {

            String roomId = generateRoomId(roomType);

            allocatedRoomIds.add(roomId);

            assignedRoomsByType
                    .computeIfAbsent(roomType, k -> new HashSet<>())
                    .add(roomId);

            availability.put(roomType, availability.get(roomType) - 1);

            System.out.println("Room allocated to " + reservation.getGuestName()
                    + ": " + roomId);
        } else {
            System.out.println("No rooms available for " + roomType);
        }
    }

    private String generateRoomId(String roomType) {
        String roomId;
        do {
            roomId = roomType.substring(0, 1).toUpperCase() + (int)(Math.random() * 1000);
        } while (allocatedRoomIds.contains(roomId));
        return roomId;
    }
}
