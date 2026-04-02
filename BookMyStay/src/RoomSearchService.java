public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();


        if (availability.get("Single") > 0) {
            System.out.println("Single Room available: " + availability.get("Single")
                    + ", Price: " + singleRoom.getPrice());
        }


        if (availability.get("Double") > 0) {
            System.out.println("Double Room available: " + availability.get("Double")
                    + ", Price: " + doubleRoom.getPrice());
        }


        if (availability.get("Suite") > 0) {
            System.out.println("Suite Room available: " + availability.get("Suite")
                    + ", Price: " + suiteRoom.getPrice());
        }
    }
}