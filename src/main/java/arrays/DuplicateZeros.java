package arrays;

/*
    Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
    arr = [1,0,2,3,0,4,5,0] after duplicating the array should look like [1,0,0,2,3,0,0,4]
    arr = [1,5,2,0,6,8,0,6,0] after duplicating the array should look like [1,5,2,0,0,6,8,0,0]
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr1);
        int[] arr2 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr2);
    }

    /*
    We have to duplicate an item at index i, and if we directly duplicate the element, it will have cascading effect and all array elements will be set to 0.
    To avoid that instead having duplicate zero, use some constant for duplicate index such Integer.MAX_VALUE and after shifting all elements,
    loop through the array elements one more time and set element to zero when you encounter the Constant.
    Time Complexity = O(N + N ) = O(N) where N is number of elements in the array.
    Space Complexity = O(1) we are not creating any extra array or data structure.
    */
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int j = arr.length - 1;
                while (j > i) {
                    arr[j] = arr[j - 1];
                }
                arr[j + 1] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Integer.MAX_VALUE) {
                arr[i] = 0;
            }
        }
    }
}
