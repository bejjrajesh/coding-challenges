package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] A1 = new int[]{3, 4, 2, 7, 14, 1, 19, 13, 11, 5};
        selectionSortSelectingMax(A1);
        System.out.println("Sorted Array Using Max = " + Arrays.toString(A1));
        int[] A2 = new int[]{3, 4, 2, 7, 14, 1, 19, 13, 11, 5};
        selectionSortSelectingMin(A2);
        System.out.println("Sorted Array Using Min = " + Arrays.toString(A2));
    }

    public static void selectionSortSelectingMax(int[] A) {
        for (int i = A.length - 1; i >= 0; i--) {
            int max = A[i];
            for (int j = 0; j <= i; j++) {
                if (A[j] > max) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                    max = A[i];
                }
            }
        }
    }

    public static void selectionSortSelectingMin(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int min = A[i];
            for (int j = i; j < A.length; j++) {
                if (A[j] < min) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                    min = A[i];
                }
            }
        }
    }
}
