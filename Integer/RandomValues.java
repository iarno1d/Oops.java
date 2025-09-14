package Integer;
import java.util.Random;
import java.util.Scanner;

public class RandomValues {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int no = sc.nextInt();
        int randNo=rand.nextInt(10);
        if(no==randNo){
            System.out.println("Your Value computer Generated Random Values are Same");
        }
        else{
            System.out.println("Computer Generated Random Value "+randNo+" does't match with your value "+no);
        }
    }
}
