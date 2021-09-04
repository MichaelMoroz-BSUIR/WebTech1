package Task3;

public class Function {
    public static String getFunction(double a, double b, double h) {
        StringBuilder str = new StringBuilder();
        for (double i = a; i <= b; i += h) {
            str.append(i).append("   ").append(Math.tan(i)).append("\n");
        }
        return str.toString();
    }
}
