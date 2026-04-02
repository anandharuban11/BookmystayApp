public class UseCase3InventorySetup {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("Initial Inventory:");
        System.out.println(inventory.getRoomAvailability());

        inventory.updateAvailability("Single", 7);
        inventory.updateAvailability("Suite", 1);

        System.out.println("\nAfter Update:");
        System.out.println(inventory.getRoomAvailability());

        inventory.bookRoom("Single");
        inventory.bookRoom("Suite");

        System.out.println("\nAfter Booking:");
        System.out.println(inventory.getRoomAvailability());

        inventory.cancelBooking("Single");

        System.out.println("\nAfter Cancellation:");
        System.out.println(inventory.getRoomAvailability());
    }
}
