import java.util.Scanner;

public class easy_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of size 5
        int[] arr = new int[5];

        // Taking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing elements
        System.out.println("You entered:");
        for (int num : arr) {   // enhanced for loop
            System.out.println(num);
        }
    }
}
