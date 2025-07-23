package ACP;
import java.util.*;
import java.util.function.Predicate;

public class calci {
    public static void main(String[] args) {
        System.out.println("...............CALCULATOR...............");
        Scanner sc = new Scanner(System.in);

        Predicate<Integer> p1 = (n) -> n==0;
        while(true){
        System.out.println("Enter 1 for addition \nEnter 2 for subtraction \nEnter 3 for multiplication \nEnter 4 for division\nEnter 5 to exit");
        int n = sc.nextInt();
        if(n==5){
            System.out.println("Exiting...");
            break;
        }
        if (n<1 || n>4) {
        System.out.println("Invalid choice...");
        continue;
        }
        System.out.println("Enter two numbers to perform required operation");
        int a = sc.nextInt();
        int b = sc.nextInt();
            switch (n) {
            case 1:
                System.out.println("Sum is : "+(a+b));
                break;
            case 2:
                System.out.println("Subtractions is : "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is : "+(a*b));
                break;
            case 4:
            if(p1.test(b)) {
                System.out.println("divison by zero");
            }
            else{
                System.out.println("Division is : "+(a/b));
            }
                break;
        }
        }

        
    }
}
