package Task2;

public class Validator {
    public static boolean isValid(double x, double y) {
        boolean isValid = x >= -6 && x <= 6 && y >= -3 && y <= 0;
        if (x >= -4 && x <= 4 && y >= 0 && y <= 5) {
            isValid = true;
        }
        return isValid;
    }
}
