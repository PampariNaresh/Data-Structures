public class SelectioSort {
    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 9, 8, 5, 1, 7 };
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            Swap(arr, min, i);
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
