package main;
import java.util.*;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        int product = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Give me five random numbers (Please, use space and at the end hit enter):");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        for (int num : array) {
            sum = sum + num;

        }
        for (int num : array) {
            product = product * num;

        }
        for (int i = 0; i < 5; i++) {

            if (largest < array[i]) {
                largest = array[i];
            }

            if (smallest > array[i]) {
                smallest = array[i];
            }

        }
        System.out.println("Sum of the numbers is:" + sum);
        System.out.println("Sum of the products is:" + product);
        System.out.println("The largest numbers is:" + largest);
        System.out.println("The smallest numbers is:" + smallest);
    }
}




