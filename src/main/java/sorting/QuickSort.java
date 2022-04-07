package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] A1 = new int[]{3, 4, 2, 7, 14, 1, 19, 13, 11, 5};
        quickSortUsingLastElementAsPivot(A1, 0, A1.length - 1);
        System.out.println("Sorting using Last Element as Pivot = " + Arrays.toString(A1));

        int[] A2 = new int[]{3, 4, 2, 7, 14, 1, 19, 13, 11, 5};
        quickSortUsingFirstElementAsPivot(A2, 0, A2.length - 1);
        System.out.println("Sorting Using First Element as Pivot = " + Arrays.toString(A2));

        int[] A3 = new int[]{3, 4, 2, 7, 14, 1, 19, 13, 11, 5};
        quickSortUsingRandomPivot(A3, 0, A3.length - 1);
        System.out.println("Sorting Using Random Pivot = " + Arrays.toString(A3));

    }

    public static void quickSortUsingLastElementAsPivot(int[] A, int start, int end) {
        if (start <= end) {
            int pivot = partition(A, start, end);
            quickSortUsingLastElementAsPivot(A, start, pivot - 1);
            quickSortUsingLastElementAsPivot(A, pivot + 1, end);
        }
    }

    public static void quickSortUsingFirstElementAsPivot(int[] A, int start, int end) {
        if (start <= end) {
            int pivotIndex = partitionUsingFirstElementAsPivot(A, start, end);
            quickSortUsingFirstElementAsPivot(A, start, pivotIndex - 1);
            quickSortUsingFirstElementAsPivot(A, pivotIndex + 1, end);
        }
    }

    public static void quickSortUsingRandomPivot(int[] A, int start, int end) {
        if (start <= end) {
            int pivotIndex = partitionUsingRandomPivot(A, start, end);
            quickSortUsingRandomPivot(A, start, pivotIndex - 1);
            quickSortUsingRandomPivot(A, pivotIndex + 1, end);
        }
    }

    public static int partitionUsingRandomPivot(int[] A, int start, int end) {
        int pivotIndex = (int) Math.floor(Math.random() * (end - start) * 1);
        //  System.out.println("random pivot is = " + pivotIndex);
        int pivot = A[pivotIndex+start];
        int i = start - 1;
        for (int j = start; j <A.length; j++) {
            if (A[j] < pivot) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[end];
        A[end] = temp;
        return i + 1;
    }

    private static int partitionUsingFirstElementAsPivot(int[] A, int start, int end) {
        int pivot = A[start];
        int i = end + 1;
        for (int j = end; j > start; j--) {
            if (A[j] > pivot) {
                i--;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i - 1];
        A[i - 1] = A[start];
        A[start] = temp;
        return i - 1;
    }

    private static int partition(int[] A, int start, int end) {
        // Selecting end element as pivot
        int pivot = A[end];
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (A[j] < pivot) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[end];
        A[end] = temp;
        return i + 1;
    }
}
