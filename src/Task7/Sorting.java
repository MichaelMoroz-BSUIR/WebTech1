package Task7;

public class Sorting {

    public static void sort(double[] array) {

        int i = 1;
        int j = i + 1;
        while (i < array.length) {
            if (i <= 0 || array[i - 1] <= array[i]) {
                i = j;
                j++;
            } else {
                double tmp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmp;
                i--;
            }
        }
    }
}
