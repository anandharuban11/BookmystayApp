public class UseCase4RoomSearch {

    public static void main(String[] args) {


        RoomInventory inventory = new RoomInventory();


        Room singleRoom = new Room("Single", 1000);
        Room doubleRoom = new Room("Double", 2000);
        Room suiteRoom = new Room("Suite", 3000);


        RoomSearchService service = new RoomSearchService();


        service.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}
