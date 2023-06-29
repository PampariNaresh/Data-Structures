class LinearSearch {
    public static void main(String args[]) {
        int arr[] = { 2, 9, 6, 8, 3 };
        int n = arr.length;
        int key = 8;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at Index:" + i);
            }
        }
    }
}