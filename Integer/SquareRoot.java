package Integer;
import java.util.Scanner;

public class SquareRoot {
    public static int squareRoot(int no){
        int result =1;
        while(result*result<=no){
            result++;
        }
        return result-1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no =sc.nextInt();
        System.out.println("The Square Root of "+no+" is "+squareRoot(no));
    }    
}
