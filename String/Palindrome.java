package String;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Word:");
        String OrgWord = sc.nextLine();
        String RevWord = "";
        for(int i=OrgWord.length()-1; i>=0;i--){
            RevWord = RevWord + OrgWord.charAt(i);
        }
        System.out.println(RevWord);
        System.out.println(OrgWord);
        if(OrgWord.equals(RevWord)){
            System.out.println("The Given Word "+OrgWord+" is Palindrome");
        }
        else{
            System.out.println("The Given Word "+OrgWord+" is Not Palindrome");
        }
    }
}
