package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadixSort {
    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 2, 7, 14, 1, 19, 13, 11, 5};
        radixSort(A);
    }

    public static void radixSort(int[] A) {
        Map<Integer, List<Integer>> hash = new HashMap();
        int r = 10;
        for (int i = 0; i < A.length; i++) {
            int key = A[i] % r;
        }

    }
}
