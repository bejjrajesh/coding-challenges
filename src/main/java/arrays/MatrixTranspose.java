package arrays;

/*
    Given an NxN matrix print its transpose.
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] result = printMatrixTranspose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        printArray(result);
    }

    public static int[][] printMatrixTranspose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[j][i];
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
