package BinarySearch;

class BookAllocation {
    public static int maxElement(int arr[]) {
        int n = arr.length;
        int ans = arr[0];
        for (int i = 0; i < n; i++) {
            if (ans >= arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        /*
         * INPUT:
         * Number of Pages in i th book in arr[i]
         * Number of Students -m
         * CONDITIONS:
         * 1.Each students gets at least one book
         * 2.Each * 3.Book allocation should bw in contigoues manner
         * OUTPUT:
         * 1.Allocte the books to "m" students
         * 2.maximum number of pages assigned to a student is minimum
         */
        int arr[] = { 25, 46, 28, 49, 24 };
        // int m = 4;
        int low = maxElement(arr);
        System.out.println(low);

    }
}