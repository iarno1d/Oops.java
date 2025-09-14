package Integer;
public class SmallestNoTernary {
    public static void main(String[] args) {
        int no1=2,no2=4,no3=6;
        int s1=(no1<no2)?no1:no2;
        int small = (s1<no3)?s1:no3;
        System.out.println("The Smallest of "+no1+ no2+ no3+" is "+small);
    }
}
