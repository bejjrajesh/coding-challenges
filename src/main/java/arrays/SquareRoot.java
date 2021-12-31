package arrays;

/*
  Given a perfect square number N returns its square root value .
 */
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Square Root of 100 is = " + sqrt(100));
        System.out.println("Square Root of 25 is = " + sqrt(25));
    }

    public static int sqrt(int n) {
        int low = 1, high = n;
        int ans = 0;
        while (low < high) {
            int mid = (low + high) / 2;
            if (mid * mid > n) {
                high = mid;
            } else if (mid * mid < n) {
                low = mid;
            } else {
                ans = mid;
                break;
            }
        }
        return ans;
    }
}
