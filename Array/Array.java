package Array;
import java.util.Scanner;

public class Array {
    public static void RightWheel(int arr[], int steps){
        int len=arr.length;
        for(int i=steps;i<len+steps;i++){
                System.out.println(arr[i%len]);
        }
    }
    // public static void LeftWheel(int arr[], int steps){
    //     int len=arr.length;
    //     for(int i=len;i<len+steps;i++){
    //             System.out.println(arr[i%len]);
    //     }
    // }
    public static void Reverse(int arr[]){
        int len=arr.length-1;
        for(int i=len;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void DuplicateElement(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i;i<len;j++){
                System.out.println((arr[i]==arr[j])?"Duplicate element "+arr[i]:"Currently no Duplicate");
            }
        }
    }
    public static void OddPositionValues(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i=i+2){
            System.out.println(arr[i]);
        }
    }
    public static void EvenPositionValues(int arr[]){
        int len=arr.length;
        for(int i=1;i<len;i=i+2){
            System.out.println(arr[i]);
        }
    }
    public static void LargestValue(int arr[]){
        int len=arr.length,max = 0;
        for(int i=0;i<len;i=i+2){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The lagest element is "+max);
    }
    public static void SmallestValue(int arr[]){
        int len=arr.length,min=arr[0];
        for(int i=0;i<len;i=i+2){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The lagest element is "+min);
    }
    public static void NoOfValues(int arr[]){
        int count=0;
        for(int _ : arr){
            count++;
        }
        System.out.println("The Number of Elements in the Array is "+count);
    }
    public static void SumOfValues(int arr[]){
        int len=arr.length, sum=0;
        for(int i=0;i<len;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of vakues is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int no=sc.nextInt();
        System.out.println("Enter the array datas: ");
        int arr[]=new int[no];
        for(int i=0;i<no;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Right steps :");
        int stepsR=sc.nextInt();
        RightWheel(arr, stepsR);
        // System.out.println("Enter the Left steps :");
        // int stepsL=sc.nextInt();
        // LeftWheel(arr, stepsL);
        System.out.println("Reverse the Arrey");
        Reverse(arr);
        System.out.println("Odd index datas");
        OddPositionValues(arr);
        System.out.println("Even index data");
        EvenPositionValues(arr);
        LargestValue(arr);
        SmallestValue(arr);
        NoOfValues(arr);
        SumOfValues(arr);
        System.out.println("Duplicate Elements in the Array:");
        DuplicateElement(arr);
    }
}
