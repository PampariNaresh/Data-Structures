public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 9, 10, 4, 5 };
        int key = 10;
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (arr[mid] == key) {
                System.out.println("Found Element at Index:" + mid);
                break;
            } else if (key > arr[mid]) {
                low = mid - 1;
            } else {
                high = mid + 1;
            }
            mid = low + (high - low) / 2;
        }
    }
}
