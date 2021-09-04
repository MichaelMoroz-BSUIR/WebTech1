package Task4;

public class Numbers {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static String findPrime(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                str.append("[").append(i + 1).append("] = ").append(array[i]).append("\n");
            }
        }
        return str.toString();
    }
}
