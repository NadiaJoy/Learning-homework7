public class Car extends Transport {
    private int vin;
    private String stateNumber;

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public void move() {
        System.out.println("This car is moving");
    }
}

