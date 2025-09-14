public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {   // if found
                return i;          // return position
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 1, 4, 9};
        int key = 4;

        int result = linearSearch(numbers, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
