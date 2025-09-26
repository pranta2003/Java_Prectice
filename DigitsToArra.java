/*
Write a java program that takes a integer input from the user and stores each digit of that number into an array.
*/

import java.util.Scanner;

public class DigitsToArra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        String numStr = Integer.toString(number);

        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; 
        }

        System.out.print("Digits in the array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        sc.close();
    }
}
