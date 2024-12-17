//import java.util.Scanner;
// public class First_01 {
//     public static void main(String[] args) {
//         // System.out.println("enter a num:");
//         // Scanner sc= new Scanner(System.in);
//         // int num= sc.nextInt();
//         // //System.out.println(num);
//         // System.out.println(num);

//         System.out.println("hello world"+" "+args[0]+" "+args[1]+" " + args[2]);
//         }
//}

/*assigning a value from one type to another type 
 two types of typecasting: widening , narrowing
 widening : small to big
 narrowing : big to small
 byte short int long float double 


 */

 public class First_01 {
    public static void main(String[] args) {
        double meradouble = 10.784;
        int myInteger = (int)meradouble;

        System.out.println(meradouble);
        System.out.println(myInteger);
    }
}