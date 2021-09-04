package Task1;

import java.util.Scanner;

public class Input {

    public static double inputNumbers(Scanner in ,String str) {
        System.out.println(str);
        while (!in.hasNextDouble()) {
            System.err.println("Error!");
            in.next();
        }
        double a = in.nextDouble();
        in.nextLine();
        return a;
    }
}
