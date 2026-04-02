public abstract class Room {
    protected int numberofBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberofBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Number of Beds: " + numberofBeds);
        System.out.println("Square Feet: " + squareFeet);
        System.out.println("Price per Night: $" + pricePerNight);

    }
}
