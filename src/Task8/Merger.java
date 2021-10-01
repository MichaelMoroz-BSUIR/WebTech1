package Task8;

import java.util.Objects;

public class Merger {

    public static int binarySearch(double key, double[] array,
                                   int low, int high,
                                   DoubleComparator cmp) {
        Objects.requireNonNull(array);
        Objects.checkFromToIndex(low, high, array.length);
        Objects.requireNonNull(cmp);

        while (low < high) {
            int mid = (low + high - 1) >>> 1;
            int c = cmp.compare(array[mid], key);
            if (c < 0)
                low = mid + 1;
            else if (c > 0)
                high = mid;
            else
                return mid;
        }
        return -(low + 1);
    }

    public static double[] merge(double[] a, double[] b, DoubleComparator comparator) {

        int len = a.length + b.length;

        if (len == 0)
            return new double[0];

        int resultSize = a.length;
        double[] array = new double[len];
        System.arraycopy(a, 0, array, 0, resultSize);

        for (int i = 0; i < b.length; i++) {
            double element = b[i];

            int destPos = binarySearch(element, array, 0, resultSize, comparator);
            if (destPos < 0)
                destPos = (-destPos) - 1;

            System.arraycopy(array, destPos, array, destPos + 1, resultSize - destPos);
            array[destPos] = element;
            resultSize++;
        }
        return array;
    }
}
