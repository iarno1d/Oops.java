package Integer;
import java.util.Scanner;

public class SumNatNo {
    public static int sumOfNat(int no){
        return no*(no+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a end value: ");
        int no=sc.nextInt();
        System.out.println("The sum of values is "+sumOfNat(no));
    }
}
