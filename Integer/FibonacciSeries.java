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

// class FibonacciDP {
//     int fib(int n) {
//         int dp[] = new int[n+1];
//         dp[0]=0; dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i] = dp[i-1]+dp[i-2];
//             System.out.println(dp[i]);}
//         return dp[n];
//     }
//     public static void main(String[] args) {
//         FibonacciDP f = new FibonacciDP();
//         System.out.println(f.fib(6)); // 8
//     }
// }
