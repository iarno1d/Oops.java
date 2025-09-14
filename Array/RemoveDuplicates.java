package Array;
public class RemoveDuplicates {
    public static void removeDuplicates(int[] arr) {
        int n = arr.length;
        
        // First sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Count unique elements
        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }
        
        // Create result array
        int[] result = new int[uniqueCount];
        result[0] = arr[0];
        int index = 1;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index++] = arr[i];
            }
        }
        
        System.out.println(result);
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,2,4,1,6,3,5};
        removeDuplicates(arr);
    }
}