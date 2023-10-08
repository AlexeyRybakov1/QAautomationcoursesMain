package homeworks;

public class CatAgeCalculator {
    // Creating a  main method
    public static void main(String[] args) {

        // Declare variables and initialize them with my age and your cat's age in years
        int yourAge = 21;
        int catAge = 8;
        int elephantAge = 27;

        // Calculate my cat's age in human years
        int catAgeInHumanYears = catAge * 7;
        // Calculating my elephant's age in human years. I don't know how, but let's say 15 times more
        int elephantAgeInHumanYears = elephantAge * 15;

        // Print the result
        System.out.println("Your cat's age in human years is: " + catAgeInHumanYears);
        System.out.println("My elephant's age in human years is: " + elephantAgeInHumanYears);
        // Calculating difference by elehpantAgeInHumanYears and catAgeInHumanYears
        int dif = elephantAgeInHumanYears - catAgeInHumanYears;
        System.out.println("Elephant's age in human years: " + elephantAgeInHumanYears + " - " + "cat's age in human years: " + catAgeInHumanYears + " = " + dif);
    }
}

