package arrays;
/*
    Given an array you have to find all leaders in the array. An element is leader if it's strictly greater than all elements on its right side.
 */

public class LeaderInArray {
    public static void main(String[] args) {
        int count1 = printLeaders(new int[]{15, -1, 7, 2, 5, 4, 2, 3});
        System.out.println("\nNumber of leaders in the array: " + count1);
        int count2 = printLeaders(new int[]{10, 7, 9, 3, 2, 4});
        System.out.println("\nNumber of leaders in the array: " + count2);
    }

    public static int printLeaders(int[] arr) {
        int count = 1;
        int max = arr[arr.length - 1];
        System.out.print("\t" + max);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
                System.out.print("\t" + arr[i]);
            }
        }
        return count;
    }
}
