package arrays;

/*
    Given a number A. Return true if number is a perfect square otherwise return false.
 */
public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquareBruteForce(7));
        System.out.println(isPerfectSquare(7));
        System.out.println(isPerfectSquareBruteForce(49));
        System.out.println(isPerfectSquare(49));
    }
    /*
        This solution is like a brute force approach where we loop through 1 to sqrt(n) and see if number twice is equals to n. If its return true else return false
        Time Complexity = O(sqrt(N))
        Space Complexity = O(1)
     */
    public static boolean isPerfectSquareBruteForce(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) return true;
        }
        return false;
    }
    /*
        This is better approach for finding perfect or not. We use the binary search technique here to find the possible square root
        Time Complexity = O(logN)
        Space Complexity = O(1)
     */
    public static boolean isPerfectSquare(int n) {
        long low =  1 , high = n;
        if(n==1) return true;
        while(low <= high) {
            long mid = (low+high)/2;
            long square = mid * mid;
            if(square == n) return true;
            if(square > n) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}
