package Task7;

import Task6.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double[] array = Input.input(in);
        System.out.println("Your array:");
        System.out.println(Arrays.toString(array));

        Sorting.sort(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
