public class MergeSort {
    public static void merge(int arr[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int temp[] = new int[arr.length];
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k = k + 1;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int q = low; q <= high; q++) {
            arr[q] = temp[q - low];
        }

    }

    public static void mergesort(int arr[], int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void main(String args[]) {
        int arr[] = { 9, 8, 5, 1, 7 };
        mergesort(arr, 0, arr.length - 1);

        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}
