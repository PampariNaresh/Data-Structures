public class QuickSort {
    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1)
                i++;
            while (arr[j] >= pivot && j >= low + 1)
                j--;
            if (i < j) {
                Swap(arr, i, j);
            }

        }
        Swap(arr, low, j);
        return j;

    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 9, 8, 5, 1, 7 };
        quicksort(arr, 0, arr.length - 1);

        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}
