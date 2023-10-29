package Vehicle;

public class Vehicle {
    String brand;
    String colour;
    String driver;

    public Vehicle(){
        this.brand="";
        this.colour="";
        this.driver="";
    }

    public String getDriverInfo(){
        return "This vehicle driver is "+ driver;
    }
}
