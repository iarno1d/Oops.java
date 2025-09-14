package Integer;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int no = sc.nextInt();
        int FirstNo =0, SecondNo =1;
        System.out.println(FirstNo+"\n"+SecondNo);
        for(int i=2;i<no;i++){
            int NextNo =FirstNo + SecondNo;
            System.out.println(NextNo);
            FirstNo=SecondNo;
            SecondNo=NextNo;
        }
        for (int i = 0; i < 6; i++)
            System.out.print(fibonacci(i) + " ");
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
