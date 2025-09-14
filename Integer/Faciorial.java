package Integer;
import java.util.Scanner;

public class Faciorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int no = sc.nextInt();
        long fact=1;
        for(int i=1;i<=no;i++){
            System.out.println(fact);
            fact*=i;
            System.out.println(fact);
        }
        System.out.println("The Factorial of "+no+" is "+fact);
        System.out.println("The Factorial of "+no+" is "+factorial(no));
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
