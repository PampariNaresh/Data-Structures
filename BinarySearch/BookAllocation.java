package BinarySearch;

class BookAllocation {
    public static int maxElement(int arr[]) {
        int n = arr.length;
        int ans = arr[0];
        for (int i = 0; i < n; i++) {
            if (ans <= arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static int sumArray(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int countStudents(int arr[], int mid) {
        int students = 1;
        int noPages = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (noPages + arr[i] <= mid) {
                noPages += arr[i];
            } else {
                students += 1;
                noPages = arr[i];
            }
        }
        return students;
    }

    public static void main(String args[]) {
        /*
         * Problem:
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
        int m = 4;
        int low = maxElement(arr);
        int high = sumArray(arr);
        int mid = low + (high - low) / 2;
        while (low <= high) {
            int nstudents = countStudents(arr, mid);
            if (nstudents > m)
                low = mid + 1;
            else
                high = mid - 1;

            mid = low + (high - low) / 2;

        }
        System.out.println(low);

    }
}