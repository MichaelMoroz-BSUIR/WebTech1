package Task6;

import java.util.Scanner;

public class Input {

    public static double[] input(Scanner in) {
        System.out.println("Enter N: ");
        int size = in.nextInt();
        double[] array = new double[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            while (!in.hasNextDouble()) {
                System.err.println("Error!");
                in.next();
            }
            array[i] = in.nextDouble();
            in.nextLine();
            if (i < size - 1) {
                System.out.println("Next->");
            }
        }
        return array;
    }
}
