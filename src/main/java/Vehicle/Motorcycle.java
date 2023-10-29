package Vehicle;

public class Motorcycle extends Vehicle {
    boolean isCruiser;

    public Motorcycle(String driver, boolean isCruiser) {
        this.driver = driver;
        this.isCruiser = isCruiser;
    }

    public void ride() {
        if (isCruiser) {
            System.out.println(driver + " is riding a cruiser motorcycle.");
        } else {
            System.out.println(driver + " is riding a non-cruiser motorcycle.");
        }
    }
}
