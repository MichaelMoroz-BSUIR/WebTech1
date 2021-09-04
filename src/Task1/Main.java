package Task1;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double x = Input.inputNumbers(in,"Enter x:");
        double y = Input.inputNumbers(in,"Enter y:");
        System.out.println("Function = " + Function.getFunction(x, y));
    }
}
