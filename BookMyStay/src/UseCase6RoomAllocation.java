public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation System");

        RoomInventory inventory = new RoomInventory();
        RoomAllocationService service = new RoomAllocationService();

        Reservation r1 = new Reservation("Arun", "Single");
        Reservation r2 = new Reservation("Bala", "Double");
        Reservation r3 = new Reservation("Chitra", "Suite");
        Reservation r4 = new Reservation("David", "Single");

        service.allocateRoom(r1, inventory);
        service.allocateRoom(r2, inventory);
        service.allocateRoom(r3, inventory);
        service.allocateRoom(r4, inventory);
    }
}