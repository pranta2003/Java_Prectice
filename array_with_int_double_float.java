import java.util.Scanner;

class ArrayExample {
    void createAndShowArrays() {
        Scanner sc = new Scanner(System.in);

        // 🔹 Integer array
        System.out.print("Enter size of integer array: ");
        int intSize = sc.nextInt();
        int[] intArr = new int[intSize];
        System.out.println("Enter " + intSize + " integers:");
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.println("You entered integers:");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("intArr[" + i + "] = " + intArr[i]);
        }

        // 🔹 Double array
        System.out.print("\nEnter size of double array: ");
        int doubleSize = sc.nextInt();
        double[] doubleArr = new double[doubleSize];
        System.out.println("Enter " + doubleSize + " double values:");
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = sc.nextDouble();
        }
        System.out.println("You entered doubles:");
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.println("doubleArr[" + i + "] = " + doubleArr[i]);
        }

        // 🔹 String array
        System.out.print("\nEnter size of string array: ");
        int strSize = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        String[] strArr = new String[strSize];
        System.out.println("Enter " + strSize + " strings:");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.nextLine();
        }
        System.out.println("You entered strings:");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("strArr[" + i + "] = " + strArr[i]);
        }
    }
}

public class Main {
    public static void array_with_int_double_float(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.createAndShowArrays();
    }
}
