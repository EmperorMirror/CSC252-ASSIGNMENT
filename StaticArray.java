import java.util.Scanner;

public class StaticArray {
    public static void main(String[] args) {
        // Declare a static array of size 10
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Populate the array with user input
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print all values in the array
        System.out.println("You entered:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
