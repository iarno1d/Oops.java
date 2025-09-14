package Integer;
import java.util.Scanner;

public class PosNeg0 {
    public static void NoType(int no){
        if(no>0){
            System.out.println("The given no "+no+" is possitive");
        }
        else if(no<0){
            System.out.println("The given no "+no+" is negative");
        }
        else{
            System.out.println("The given no "+no+" is Zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int no=sc.nextInt();
        NoType(no);
    }
}
