// Java implementation of recursive Binary Search
/* 
We basically ignore half of the elements just after one comparison. 
Compare x with the middle element.
If x matches with the middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for the right half.
Else (x is smaller) recur for the left half.
*/

class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l && l<arr.length-1) {
           
            int mid = l + (r - l) / 2;
            
            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
 
        return -1;
    }
 
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
