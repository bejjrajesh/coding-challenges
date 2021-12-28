package arrays;

import java.util.Arrays;

/*
    You are given two integer arrays n1 and n2, sorted in ascending order, and two integers m and n, representing the number of elements in n1 and n2 respectively.
    Merge n1 and n2 into a single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function, but instead be stored inside the array n1.
    To accommodate this, n1 has a length of m + n, where the first m elements denote the elements that should be merged,
    and the last n elements are set to 0 and should be ignored. n2 has a length of n.
    Ex: n1 = [1,2,3,0,0,0], m = 3, n2 = [2,5,6], n = 3 Result :  [1,2,2,3,5,6]
        n1 = [2,0], m = 1, n2 = [1], n = 1 Result :  [1,2]
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] n1 = new int[]{1, 2, 3, 0, 0, 0}, n2 = new int[]{2, 5, 6};
        int m = 3, n = 3;
        System.out.println("n1 = " + Arrays.toString(n1));
        mergeSortedArrays(n1, m, n2, n);
        System.out.println("n2 = " + Arrays.toString(n2));
        System.out.println("Merged Array = " + Arrays.toString(n1) + "\n");

        int[] n3 = new int[]{2, 0}, n4 = new int[]{1};
        int n3Length = 1, n4Length = 1;
        System.out.println("n1 = " + Arrays.toString(n3));
        mergeSortedArrays(n3, n3Length, n4, n4Length);
        System.out.println("n2 = " + Arrays.toString(n2));
        System.out.println("Merged Array = " + Arrays.toString(n1));
    }

    public static void mergeSortedArrays(int[] n1, int m, int[] n2, int n) {
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            int v1 = n1[i];
            int v2 = n2[j];
            if (v1 < v2) {
                n1[index] = v2;
                j--;
            } else if (v1 > v2) {
                n1[index] = v1;
                i--;
            } else {
                n1[index] = v1;
                n1[index - 1] = v1;
                i--;
                j--;
                index--;
            }
            index--;
        }
        while (j >= 0) {
            n1[index] = n2[j];
            j--;
            index--;
        }
    }
}
