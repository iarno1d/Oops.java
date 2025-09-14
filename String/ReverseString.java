package String;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        String RevWord = "";
        for(int i=s.length()-1; i>=0;i--){
            RevWord = RevWord + s.charAt(i);
        }
        System.out.println("OrgString "+s+" RevString "+RevWord);
    }
}
