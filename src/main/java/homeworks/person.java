package homeworks;

public class person {
     String name;
     String surname;
     int age;
     boolean isHired;

    public person(String name, int birthYear) {
        this.name = name;
        this.age = calculateAge(birthYear);
    }

    public person(String name) {
        this.name = name;
        this.age = 0;
    }

    public void hire(){
        this.isHired=true;
    }
    public void fire(){
        this.isHired = false;
    }

    public void older() {
        this.age++;
    }

    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    private int calculateAge(int birthYear) {
        int currentYear = 2023;
        return currentYear - birthYear;
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isHired=" + isHired +
                '}';
    }
}
