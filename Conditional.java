import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        if( year %2000 != 0 && year %400 == 0 || year %100 !=0 && year %4 ==0) {
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not a leap year");
        }
    }
}
