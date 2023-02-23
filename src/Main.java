public class Main {
    public static void main(String[] args) {

        Transport car = new Transport();
        car.setName("Audi");
        car.setSeats(-5);

        System.out.println("Name of my transport is " + car.getName());
        System.out.println("Amount of seats = " + car.getSeats());

    }
}
