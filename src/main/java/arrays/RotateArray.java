package arrays;

import java.util.Arrays;

/*
  Given an array rotate the array k times in anticlockwise and print the array.
  Ex: [-2, 3, 1, 4, 6, 2, 8, 7, 9, 3] Result: [7, 9, 3, -2, 3, 1, 4, 6, 2, 8]
  Reversing the entire array is equals to reverse whole array and then reversing the in parts where first part is
  equals to rotations and second part is equals to length-rotations.
  For the given example
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] a1 = new int[]{-2, 3, 1, 4, 6, 2, 8, 7, 9, 3};
        rotateKTimes(a1, 3);
        System.out.println("Array after rotating 3 times = " + Arrays.toString(a1));
        int[] a2 = new int[]{-2, 3, 1, 4, 6, 2, 8, 7, 9, 3};
        rotateKTimes(a2, 13);
        System.out.println("Array after rotating 13 times = " + Arrays.toString(a2));
    }

    public static void rotateKTimes(int[] arr, int k) {
        int rotations = k > arr.length ? k % arr.length : k;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, rotations - 1);
        reverseArray(arr, rotations, arr.length - 1);
    }


    private static void reverseArray(int[] arr, int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
