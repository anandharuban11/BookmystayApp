public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        RoomInventory inventory = new RoomInventory();
        CancellationService cancellationService = new CancellationService();


        cancellationService.registerBooking("R101", "Single");
        cancellationService.registerBooking("R102", "Double");


        cancellationService.cancelBooking("R101", inventory);
        cancellationService.cancelBooking("R102", inventory);


        cancellationService.showRollbackHistory();
    }
}
