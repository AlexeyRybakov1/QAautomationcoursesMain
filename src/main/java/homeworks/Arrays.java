package homeworks;

public class Arrays {
 //I'm very sorry, but I couldn't attend the last lesson.
    public static void main(String[] args) {
        int[] fibonacciNumbers = new int[11];
        fillFibonacciArray(fibonacciNumbers);
        increaseArrayElementsBy5(fibonacciNumbers);
        printArray(fibonacciNumbers);
    }
    private static void fillFibonacciArray(int[] array) {
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
    }
    private static void increaseArrayElementsBy5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 5;
        }
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}