package Integer;
import java.util.Scanner;

public class OddEven {
    public static void printOddEven(int[] arr) {
        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        
        System.out.print("\nOdd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int no = sc.nextInt();
        if(no%2==0){
            System.out.println("The Given No "+no+" is Even");
        }
        else{
            System.out.println("The Given No "+no+" is Odd");
        }
        System.out.println("The even numbers from 1 to 100 are");
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i);
            }
        }
        System.out.println("\nThe odd numbers from 1 to 100 are");
        for(int i=1;i<=100;i++){
            if(i%2==1){
                System.out.print(i);
            }
        }
    }
}
