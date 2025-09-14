package Integer;
import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of A:");
        int A =sc.nextInt();
        System.out.print("Enter value of B:");
        int B=sc.nextInt();
        System.out.println("A and B before Swapping");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("A and B After Swapping W/O Temp");
        A=A^B;
        B=A^B;
        A=A^B;
        System.out.println("A: "+A);
        System.out.println("B: "+B);
    }
}
