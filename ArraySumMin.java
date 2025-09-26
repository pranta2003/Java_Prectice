/*

Write a java program to calculate the sum and find the minimum value of elements in an integer array.

*/

import java.util.Scanner;

public class ArraySumMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Minimum element: " + min);

        sc.close();
    }
}
