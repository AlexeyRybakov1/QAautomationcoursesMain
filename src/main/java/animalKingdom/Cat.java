package animalKingdom;

public class Cat extends Animal{
    private boolean isStriped;
    public Cat(){
        super("Cat");
        super.setSound("Mew");
    }
    public  boolean isStriped(){
        return isStriped;
    }
    public void setStriped(boolean striped){
        isStriped = striped;
    }
}
