package DSA;
public class factorial{
    public static void main(String[] args) {
                int num = 5;
                System.out.println("Factorial of " + num + " is " + factorial1(num));
            }
        
        public static int factorial1(int n){
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial1(n - 1);
        }
     
}
