import java.util.Scanner;
public class Loops1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        
        n = sc.nextInt();
        for(int i=2;i<=n;i++){
            int k=0;
            if(n%i ==0){
            for(int j=2;j<=i;j++){
                if(i%j ==0){
                    k++;
                }
                
            }
            if(k==1){
                System.out.print(i + " ");
            }
        }
    }
    }
}
