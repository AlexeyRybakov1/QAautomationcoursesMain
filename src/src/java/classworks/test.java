package src.src.java.classworks;
public class test {

    public static void main(String[] args) {
        String firstName = "Алексей";
        String lastName = "Рыбаков";
        String fullName1 = firstName + " " + lastName;
        System.out.println(fullName1);
        
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);

        String fullName3 = lastName + ", " + firstName;
        System.out.println(fullName3);

        String fullName4 = lastName.concat(", ").concat(firstName);
        System.out.println(fullName4);

        String prefix = "Мистер"; // Здесь вы можете изменить префикс на нужный
        String fullNameWithPrefix = prefix + " " + firstName + " " + lastName;
        System.out.println(fullNameWithPrefix);



    }
}
