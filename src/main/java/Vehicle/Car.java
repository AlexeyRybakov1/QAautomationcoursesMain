package Vehicle;

public class Car extends Vehicle{
    String numberPlate;

    public  Car(){
        super();
        numberPlate="";

    }
    public void wash(){
        System.out.println("Your car has been washed. Number plate: "+ numberPlate);
    }


}
