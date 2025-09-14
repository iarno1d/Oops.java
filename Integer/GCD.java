package Integer;
import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int no1 = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int no2 = sc.nextInt();
        System.out.println("The GCD of "+no1+" and "+no2+" is "+gcd(no1, no2));
    }
}