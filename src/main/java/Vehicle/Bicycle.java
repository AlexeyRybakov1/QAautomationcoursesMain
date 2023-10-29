package Vehicle;

public class Bicycle extends Vehicle{
    boolean isFolded;
    int speedCount;

    public Bicycle(){
        super();
        this.isFolded = true;
        this.speedCount = 1;
    }

    public boolean fold(){
        if ( this.isFolded ) return  false;
        else {
            this.isFolded = true;
            return true;
        }
    }
}
