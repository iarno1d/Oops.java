public class BinarySearch {
    public static int search(int[] arr, int target){
        int l=0, r=arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};
        int idx = search(arr, 12);
        System.out.println("Index: " + idx);
    }
}
