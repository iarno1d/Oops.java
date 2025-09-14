package Integer;
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int no =sc.nextInt();
        boolean flag= true;
        for(int i=2;i<no;i++){
            if(no%i==0){
                flag= false;
            }
        }
        if(flag){
            System.out.println("The Given No "+no+" is Prime Number");
        }
        else{
            System.out.println("The Given No "+no+" is Not a Prime Number");
        }
    }
}