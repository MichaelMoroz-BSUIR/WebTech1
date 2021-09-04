package Task2;

import java.util.Scanner;


public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double x = Task1.Input.inputNumbers(in, "Enter x:");
        double y = Task1.Input.inputNumbers(in,"Enter y:");
        System.out.println(Validator.isValid(x, y));
    }
}
