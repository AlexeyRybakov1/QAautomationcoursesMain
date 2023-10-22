package homeworks;

public class Launcher {
    public static void main(String[] args) {
        person person1 = new person("Aleksey");
        person person2 = new person("Arina", 2002);

        person1.setSurname("Rybakov");
        person2.setSurname("Rybakova");

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        if (person1.age > 18) {
            person1.hire();
        }

        if (person2.age > 18) {
            person2.hire();
        }

        System.out.println("Person 1 after hiring: " + person1);
        System.out.println("Person 2 after hiring: " + person2);

        person1.older();
        person2.older();

        System.out.println("Person 1 after celebrating birthday: " + person1);
        System.out.println("Person 2 after celebrating birthday: " + person2);
    }
}
