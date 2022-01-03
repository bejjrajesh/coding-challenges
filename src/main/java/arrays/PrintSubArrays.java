package arrays;

/*
  Given an array, print it's all subArrays.
*/
public class PrintSubArrays {
    public static void main(String[] args) {
        printAllSubArrays(new int[]{1, 2, 3, 4, 5, 6});
    }

    public static void printAllSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
