package Integer;
import java.util.Scanner;

public class SumOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int no = sc.nextInt();
        int sum=0;
        for(int i=1;i<=no;i++){
            sum+=i;
        }
        System.out.print("The Number of "+no+" is "+sum);
    }
}
