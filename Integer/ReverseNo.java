package Integer;
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Orgno =sc.nextInt();
        int RevNo=0;
        System.out.println("Orginal Number"+Orgno);
        while(Orgno !=0){
            System.out.println("OrgNo "+Orgno+" RevNo "+RevNo);
            int remainder =Orgno%10;
            System.out.println("OrgNo "+Orgno+" RevNo "+RevNo+" Remainder "+remainder);
            RevNo=RevNo*10+remainder;
            System.out.println("OrgNo "+Orgno+" RevNo "+RevNo+" Remainder "+remainder);
            Orgno = Orgno/10;
            System.out.println("OrgNo "+Orgno+" RevNo "+RevNo+" Remainder "+remainder);
        }
        System.out.println("OrgNo "+Orgno+" RevNo "+RevNo);
        System.out.println("Reversed Number"+RevNo);

    }
}
