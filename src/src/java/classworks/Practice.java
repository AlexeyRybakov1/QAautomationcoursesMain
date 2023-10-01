package src.src.java.classworks;
public class Practice {
    public static void main(String[] args) {
        int dayNum = 4;
        String weekDay = "";

        switch (dayNum) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Truhsday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "N/A";

        }
        System.out.println("Today is " + weekDay);

    }

}
