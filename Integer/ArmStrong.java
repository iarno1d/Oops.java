package Integer;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int no = sc.nextInt();
        int OrgNo=no, sum=0, NoOfDigits=0;
        int tempNo=no;
        while(tempNo !=0){
            tempNo/=10;
            NoOfDigits++;
        }
        tempNo=OrgNo;
        while(tempNo!=0){
            int digit =tempNo % 10;
            sum += Math.pow(digit,NoOfDigits);
            tempNo /= 10;
        }
        if(sum==OrgNo){
            System.out.println("The Given Number "+no+" is ArmString Number");
        }
        else{
            System.out.println("The Given Number "+no+" is Not the ArmString Number");
        }
    }
}
