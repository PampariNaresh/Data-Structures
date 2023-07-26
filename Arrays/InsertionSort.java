public class InsertionSort {
    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 9, 8, 5, 1, 7 };
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                Swap(arr, j - 1, j);
                j--;
            }

        }
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}
