package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] A = new int[]{1, 5, 2, 3, 9, 7, 4};
        insertionSort(A);
        System.out.println(Arrays.toString(A));
    }

    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int temp = A[i], j = i - 1;
            while (j >= 0) {
                if (A[j] > temp) {
                    A[j + 1] = A[j];
                } else {
                    break;
                }
                j--;
            }
            A[j + 1] = temp;
        }
    }

    public void mergeCount(int[] arr, int s, int mid, int e) {
        int count = 0;
        int[] temp1 = new int[mid - s + 1], temp2 = new int[e - mid + 1];
        int index = s;
        for (int i = 0; i < temp1.length; i++) {

        }
    }
}
