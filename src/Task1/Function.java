package Task1;

public class Function {
    public static double getFunction(double x, double y) {
        double a = 1 + Math.pow(Math.sin(x + y), 2);
        double b = 2 + Math.abs((x - 2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
        return a / b + x;
    }
}
