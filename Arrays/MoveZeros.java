class MoveZeros {
    public static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 0, 4, 0, 0, 9, 7 };
        int j = -1;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(i, j, arr);
                j++;
            }
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}