public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("Data Persistence & Recovery");

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        String filePath = "inventory.txt";

        // Save inventory
        persistenceService.saveInventory(inventory, filePath);
        System.out.println("Inventory saved.");

        // Modify inventory (simulate change)
        inventory.getRoomAvailability().put("Single", 0);

        // Load inventory back
        persistenceService.loadInventory(inventory, filePath);
        System.out.println("Inventory loaded.");

        // Display inventory
        for (String type : inventory.getRoomAvailability().keySet()) {
            System.out.println(type + ": " + inventory.getRoomAvailability().get(type));
        }
    }
}