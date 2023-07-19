public class SecondSmallest {
    public static void main(String args[]) {
        int arr[] = { 1, 6, 7, 9, 3, 2 };
        int n = arr.length;
        int secondsmallest = -1;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondsmallest) {
                secondsmallest = arr[i];
            }

        }
        System.out.println(secondsmallest);

    }
}