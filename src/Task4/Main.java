package Task4;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = Input.input(in);
        System.out.println(Numbers.findPrime(arr));
    }
}
