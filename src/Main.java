public class Main {
    public static void main(String[] args) {

        Transport motocycle = new Transport();
        motocycle.setName("Yamaha");
        motocycle.setSeats(2);

        System.out.println("Name of my transport is " + motocycle.getName());
        System.out.println("Amount of seats = " + motocycle.getSeats());

        Car myCar = new Car();
        myCar.move();
        myCar.options();

    }
}
