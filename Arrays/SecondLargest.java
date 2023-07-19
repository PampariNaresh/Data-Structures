/*
 * import java.util.*;
 * 
 * public class SecondLargest {
 * public static void main(String args[]) {
 * int arr[] = { 1, 6, 7, 9, 3, 2 };
 * int n = arr.length;
 * Arrays.sort(arr);
 * 
 * int largest = arr[n - 1];
 * int secondlargest = -1;
 * for (int i = n - 2; i >= 0; i--) {
 * if (largest != arr[i]) {
 * secondlargest = arr[i];
 * break;
 * }
 * }
 * System.out.println(secondlargest);
 * 
 * }
 * }
 */
/*
 * public class SecondLargest {
 * public static void main(String args[]) {
 * int arr[] = { 1, 6, 7, 9, 3, 2 };
 * int n = arr.length;
 * 
 * int largest = arr[0];
 * for (int i = 0; i < n; i++) {
 * if (arr[i] > largest) {
 * largest = arr[i];
 * }
 * }
 * int secondlargest = -1;
 * for (int i = 0; i < n; i++) {
 * if (largest != arr[i] && arr[i] > secondlargest) {
 * secondlargest = arr[i];
 * 
 * }
 * }
 * System.out.println(secondlargest);
 * 
 * }
 * }
 */

public class SecondLargest {
    public static void main(String args[]) {
        int arr[] = { 1, 6, 7, 9, 3, 2 };
        int n = arr.length;
        int secondlargest = -1;
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }

        }
        System.out.println(secondlargest);

    }
}