package Task4;

import java.util.Scanner;

public class Input {
    static int[] input(Scanner in) {
        System.out.println("Enter N: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            while (!in.hasNextInt()) {
                System.err.println("Error!");
                in.next();
            }
            array[i] = in.nextInt();
            in.nextLine();
            if (i < size - 1) {
                System.out.println("Next->");
            }
        }
        return array;
    }
}
