package Integer;
import java.util.Scanner;

public class LargestNo {
    public static int largeNo(int no1,int no2){
        if(no1<no2){
            return no1;
        }else{
            return no1;
        }
    }
    public static int largeNo(int no1, int no2, int no3){
        if((no1>no2) && (no1>no3)){
            return no1;
        }
        else if((no1<no2) && (no3 < no2)){
            return no2;
        }
        else{
            return no3;
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter");
    }
}
