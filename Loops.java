import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            //System.out.println("5 * "+ i +" = "+ (5*i));
            
            if(n%i==0){
                System.out.println("not prime");
                break;
            }
            else{
                System.out.println("prime");
            }
        }
    }
}