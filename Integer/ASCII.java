package Integer;
import java.util.Scanner;

public class ASCII {
    public int getAsciiValue(char value) {
        return (int) value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = sc.nextLine(); 
        char no = input.charAt(0);
        ASCII ascii = new ASCII();
        int asciiValue = ascii.getAsciiValue(no);
        System.out.println("The ASCII Value of '" + no + "' is " + asciiValue);
        sc.close();
    }
}
