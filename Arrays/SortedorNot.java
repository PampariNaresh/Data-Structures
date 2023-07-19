public class SortedorNot {
    public static void main(String args[]) {
        // int arr[] = { 1, 6, 7, 9, 3, 2 };
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                System.out.println("Not Sorted");
                return;
            }
        }
        System.out.println("Sorted");

    }
}
