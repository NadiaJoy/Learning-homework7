public class Transport {
    private String name;
    private int seats;

    public void move() {
        System.out.println(name + " is moving");
    }

    public void options() {
        System.out.println("I can move forward and back");
    }

    public Transport() {
        System.out.println("New Transport creating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int places) {
        if (places > 0) {
            this.seats = places;
        } else {
            this.seats = 1;
            System.out.println("Attention! Amount of seats must be > 0! " +
                    "\nThe number of seats has been automatically changed to 1");
        }

    }
}
