//WAP to print name ,age,roll no, martial status in boolean
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {

        /*always declare double at last or use obj.nextline everytime becaz it takes all the space and no space is left after that */
        Scanner sc = new Scanner(System.in);
        String name,gender,country;
        int age;
        double roll_no;
        int a = 40;
        int b=60;
        boolean ms;
        name = sc.nextLine();
        age = sc.nextInt();
        gender = sc.nextLine();
        sc.nextLine();
        roll_no = sc.nextDouble();
        country = sc.nextLine();
        sc.nextLine();
        ms = sc.nextBoolean();
        System.out.print(name +" "+ age +" "+gender+" "+country+" "+ roll_no+" "+ ms); 



    //     System.out.println(a<<1);           //double
    //    System.out.println(a>>1);        //half
    //    System.out.println(b<<1);
    //    System.out.println(b>>1);
    //    System.out.println(a&b);
    //    System.out.println(a|b);
    //    System.out.println(a^b);
    }
}
