package src.src.java.homeworks;

public class lesson5 {
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Multiplication table for "+ number + ": ");
        for (int i = 1; i<11; i++){
            int umnozhenie = number * i;
            System.out.println(number + " * " + i + " = "+ umnozhenie);
        }
        System.out.println();
        System.out.println("Stars: ");
        int rows = 8;
        int koloni = 15;
        for (int y = 0; y <rows; y ++){
            for (int x = 0; x<koloni; x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("FizzBuzz Challenge!: ");
        for (int g =1; g<= 100; g++){
            if (g%3==0 && g % 5 ==0){
                System.out.println("FizzBuzz");
            } else if ( g % 3 == 0 ){
                System.out.println("Fizz");

            } else if ( g % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(g);
            }
        }
    }
}
