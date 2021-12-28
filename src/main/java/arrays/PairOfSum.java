package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairOfSum {

    public static void main(String[] args) {

        int[] arr = new int[]{8, 7, 2, 5, 3, 1};
        findPairsWithBruteForce(arr, 10);
        findPairsWithSumBetterTime(arr, 10);
        findPairsWithSumBestTime(arr,10);

        int[] ex2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        findPairsWithBruteForce(ex2, 17);
        findPairsWithSumBetterTime(ex2, 17);
        findPairsWithSumBestTime(ex2,17);
    }

    /*
       This is the naive approach with two loops and in each iteration see if its sum matches with expected sum
       Since we are using two loops -> Time Complexity - O(n2)
    */
    public static int[] findPairsWithBruteForce(int[] arr, int sum) {
        System.out.println("\nNaive Solution\n=======================");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Found pair => ["+ arr[i]+","+arr[j]+"]");
                }
            }
        }
        return new int[0];
    }

    /*
    In this approach we try to reduce two loops into one loop. In each iteration we remove current element value from the sum and
        check if the remaining sum is present in the array.
     */
    public static void findPairsWithSumBetterTime(int [] arr,int targetSum){

        System.out.println("\nBetter Solution\n=======================");
        Set<Integer> set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            int partialSum = targetSum - arr[i];
            if(set.contains(partialSum)){
                System.out.println("Found pair => ["+ arr[i]+","+partialSum+"]");
            }else{
                set.add(arr[i]);
            }
        }
    }

    /*
        Th

     */
    public static void findPairsWithSumBestTime(int[] arr, int sum) {

        System.out.println("\nBest Solution\n=======================");
        int low = 0;
        int high = arr.length - 1;
        Arrays.sort(arr);
        while (low < high) {
            int currentSum = arr[low] + arr[high];
            if(currentSum==sum) {
                System.out.println("Found pair => ["+ arr[low]+","+arr[high]+"]");
                low++;
                high--;
            }else if (currentSum < sum) {
                low++;
            } else {
                high--;
            }
        }
    }
}
