import java.util.Scanner;

class ArrayExample {
    void createAndShowArray() {
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        // Create array with user-defined size
        int[] arr = new int[size];

        // Take input from user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the array elements
        System.out.println("You entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ": " + arr[i]);
        }
    }
}

public class simple_array {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.createAndShowArray();
    }
}
