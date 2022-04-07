package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 2, 7, 14, 1, 19, 13, 11, 5};
        mergeSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    public static void mergeSort(int[] A, int start, int end) {
        if (start == end) return;
        int mid = (start + end )/ 2;
        mergeSort(A, start, mid);
        mergeSort(A, mid + 1, end);
        merge(A, start, mid, end);
    }

    private static void merge(int[] A, int start, int mid, int end) {
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];
        int index = 0;
        for (int i = start; i <= mid; i++) {
            left[index] = A[i];
            index++;
        }
        index = 0;
        for (int i = mid + 1; i <= end; i++) {
            right[index] = A[i];
            index++;
        }
        index = start;
        int lPointer = 0, rPointer = 0;
        while (lPointer < left.length && rPointer < right.length) {
            if (left[lPointer] <= right[rPointer]) {
                A[index] = left[lPointer];
                lPointer++;
                index++;
            } else {
                A[index] = right[rPointer];
                rPointer++;
                index++;
            }
        }
        while (lPointer < left.length) {
            A[index] = left[lPointer];
            lPointer++;
            index++;
        }
        while (rPointer < right.length) {
            A[index] = right[rPointer];
            rPointer++;
            index++;
        }
    }
}
