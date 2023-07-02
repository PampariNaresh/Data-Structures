
public class CountOccurrence {

    public static int firstOccurrence(int arr[], int key) {
        int first = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return first;
    }

    public static int lastOccurrence(int arr[], int key) {
        int last = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return last;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int key = 8;
        int count = lastOccurrence(arr, key) - firstOccurrence(arr, key) + 1;
        System.out.println(count);
    }
}
