public class MergeSort {
    // Divide and conquer - split, sort, merge
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSort(arr, left, mid);      // Sort first half
            mergeSort(arr, mid + 1, right); // Sort second half
            
            merge(arr, left, mid, right);   // Merge sorted halves
        }
    }
    
    private static void merge(int[] arr, int left, int mid, int right) {
        // Create temporary arrays
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];
        
        // Copy data to temp arrays
        System.arraycopy(arr, left, leftArray, 0, leftArray.length);
        System.arraycopy(arr, mid + 1, rightArray, 0, rightArray.length);
        
        // Merge temp arrays
        int i = 0, j = 0, k = left;
        
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        
        // Copy remaining elements
        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));
    }
}