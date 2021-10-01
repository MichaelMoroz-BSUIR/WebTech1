package Task5;

import Task4.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = Input.input(in);
        System.out.println("Your array:");
        System.out.println(Arrays.toString(array));

        System.out.println(Sequence.amountToLis(array));
    }
}
