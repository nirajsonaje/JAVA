public class binarysearch {
    // Returns index of x if it is present in arr[].
    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;// 4
        while (l <= r) {
            int m = l + (r - l) / 2;// 2
            // int arr[] = { 2, 3, 4, 10, 40 };
            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

            // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    // Driver code
    public static void main(String args[]) {
        binarysearch ob = new binarysearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        // int m = 0 + (4 - 1) / 2;
        // System.out.println(m);
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}
