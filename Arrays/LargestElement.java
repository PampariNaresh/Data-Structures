class LargestElement {
    public static void main(String args[]) {
        int arr[] = { 1, 6, 7, 3, 2 };
        int largestelement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestelement) {
                largestelement = arr[i];
            }
        }
        System.out.println(largestelement);
    }
}