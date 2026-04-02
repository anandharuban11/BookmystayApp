public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        System.out.println("Booking History Report");

        BookingHistory history = new BookingHistory();

        Reservation r1 = new Reservation("Arun", "Single");
        Reservation r2 = new Reservation("Bala", "Double");
        Reservation r3 = new Reservation("Chitra", "Suite");

        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);

        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(history);
    }
}