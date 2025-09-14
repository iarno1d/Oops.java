public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // current element
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // shift
                j--;
            }
            arr[j + 1] = key; // insert
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};
        insertionSort(numbers);

        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
