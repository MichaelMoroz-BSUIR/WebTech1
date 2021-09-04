package Task3;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double a = Task1.Input.inputNumbers(in, "Enter a: ");
        double b = Task1.Input.inputNumbers(in, "Enter b: ");
        double h = Task1.Input.inputNumbers(in, "Enter h: ");
        String str = Function.getFunction(a, b, h);
        System.out.println(str);
    }
}
