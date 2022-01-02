package arrays;
/*
 Given N array elements count the number of Equilibrium Indexes in the array.
 An index is Equilibrium Index if sum of all elements before it and sum of all elements after the index are equals.
 Ex: [-7, 1 ,5, 2,-4, 3, 0] Result: Index 3 and 6 are Equilibrium Index with sum equals to -1 and 0 respectively.
 */

public class EquilibriumIndex {

    public static void main(String[] args) {
        printEquilibriumIndexes(new int[]{0, 1, 2, 3, 4, 5, 6});
        printEquilibriumIndexes(new int[]{-7, 1, 5, 2, -4, 3, 0});
    }

    public static void printEquilibriumIndexes(int[] arr) {
        int[] prefix = calculatePrefixArray(arr);
        for (int i = 0; i < arr.length; i++) {
            int left = 0, right = 0;
            if (i == 0) {
                right = prefix[arr.length - 1] - prefix[0];
            } else if (i == arr.length - 1) {
                left = prefix[i - 1];
            } else {
                left = prefix[i - 1];
                right = prefix[arr.length - 1] - prefix[i];
            }
            if (left == right) System.out.println(arr[i]);
        }
    }

    private static int[] calculatePrefixArray(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        return prefix;
    }
}
