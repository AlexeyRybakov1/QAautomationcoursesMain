package animalKingdom;

public class Dog extends Animal{
    String breed;

    public Dog(){
        super("Dog");
        super.setSound("Woof");
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void  givePaw(){
        System.out.println("This dog gave you its paw");
    }
}
