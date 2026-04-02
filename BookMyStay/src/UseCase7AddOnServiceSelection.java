public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "R101";

        AddOnService s1 = new AddOnService("Breakfast", 200);
        AddOnService s2 = new AddOnService("WiFi", 100);
        AddOnService s3 = new AddOnService("Airport Pickup", 500);

        manager.addService(reservationId, s1);
        manager.addService(reservationId, s2);
        manager.addService(reservationId, s3);

        double totalCost = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Total Add-On Cost for " + reservationId + ": " + totalCost);
    }
}
