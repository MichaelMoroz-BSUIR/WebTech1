package Task8;

import Task6.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter sorted array");
        double[] a = Input.input(in);

        System.out.println("Enter sorted array");
        double[] b = Input.input(in);

        System.out.println("First array");
        System.out.println(Arrays.toString(a));

        System.out.println("Second array");
        System.out.println(Arrays.toString(b));

        double[] merge = Merger.merge(a, b, DoubleComparator.NORMAL);

        System.out.println("Merged array");
        System.out.println(Arrays.toString(merge));
    }
}
