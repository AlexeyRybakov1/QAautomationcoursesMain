package Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[12];
        vehicles[0] = new Car();
        vehicles[0].driver = "Vasily";
        ((Car) vehicles[0]).numberPlate = "ME 251";

        vehicles[1] = new Truck();
        ((Truck) vehicles[1]).loadUp(500);

        vehicles[2] = new Sedan();
        vehicles[2].driver = "Maria";
        ((Sedan) vehicles[2]).numberPlate = "MC 6645";

        vehicles[3] = new Bicycle();

        vehicles[4] = new Car();
        vehicles[4].driver = "John";
        ((Car) vehicles[4]).numberPlate = "AB 123";

        vehicles[5] = new Sedan();
        vehicles[5].driver = "Arina";
        ((Sedan) vehicles[5]).numberPlate = "XY 789";

        vehicles[6] = new Truck();
        ((Truck) vehicles[6]).loadUp(750);

        vehicles[7] = new Bicycle();
        ((Bicycle) vehicles[7]).isFolded = true;

        vehicles[8] = new Car();
        vehicles[8].driver = "Ivan";
        ((Car) vehicles[8]).numberPlate = "CD 456";

        vehicles[9] = new Truck();
        ((Truck) vehicles[9]).loadUp(600);

        vehicles[10] = new Motorcycle("Alexey", true);

        vehicles[11] = new ElectricCar("Sofia", "E-1234", true);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getDriverInfo());
            if (vehicle instanceof Motorcycle) {
                ((Motorcycle) vehicle).ride();
            } else if (vehicle instanceof ElectricCar) {
                ((ElectricCar) vehicle).charge();
            } else if (vehicle instanceof Car) {
                ((Car) vehicle).wash();
            } else if (vehicle instanceof Truck) {
                ((Truck) vehicle).wash();
            } else if (vehicle instanceof Bicycle) {
                System.out.println("Try to fold my bicycle: " + ((Bicycle) vehicle).fold());
            }
        }
    }
}
