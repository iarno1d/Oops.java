package Integer;
import java.util.Scanner;

public class PerfectSq {
    public static void perfectSq(int no){
        boolean flag= false;
        if(no<0){
            System.out.println("Negative no not allowed");
        }
        else{
            for(int i=0; i*i<=no;i++){
                if(i*i==no){
                    flag=true;
                    break;
                }
            }
            System.out.println("The Given no "+no+" is "+((flag)?"perfect square no":"not perfect no"));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no=sc.nextInt();
        perfectSq(no);
    }
}
