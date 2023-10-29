package Vehicle;

public class Truck extends Car{
    int maxLoad;

    public Truck(){
        super();
        maxLoad= 0;
    }
    public void loadUp(int amount){
        System.out.println("Truck has been loaded by " + amount);
        this.maxLoad = this.maxLoad + amount;
    }

    @Override
    public void wash() {
        System.out.println("Your truck has been washed. Used a lot of water.");
    }
}
