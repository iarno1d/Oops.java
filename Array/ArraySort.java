package Array;
public class ArraySort {
    public static void sortAsc(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Asc");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }   
    }
    public static void sortDes(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Dec");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }   
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,4,5,8,6,4,-1};
        sortDes(arr);
        sortAsc(arr);
    }
}
