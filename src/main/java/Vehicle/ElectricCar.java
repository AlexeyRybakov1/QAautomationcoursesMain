package Vehicle;

public class ElectricCar extends Car {
    boolean isElectric;

    public ElectricCar(String driver, String numberPlate, boolean isElectric) {
        this.driver = driver;
        this.numberPlate = numberPlate;
        this.isElectric = isElectric;
    }

    public void charge() {
        if (isElectric) {
            System.out.println(driver + "'s electric car is charging.");
        } else {
            System.out.println(driver + "'s car is not electric.");
        }
    }
}
