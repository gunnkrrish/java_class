// no default value to local variable
import java.util.Scanner;
public class Vending{
    public static void main(String[] args) {
        int item;
        int amount =0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Menu : \n ITEM 1: RS 20 \n ITEM 2 : RS 30");
        System.out.println("ENTER THE ITEM NO U WANT TO BUY");
        item = sc.nextInt();
        switch (item) {
            case 1:
                System.out.println("ITEM 1 selected , insert rs 20");
                amount = sc.nextInt();
                sc.nextLine();
                if(amount == 20){
                    System.out.println("u receieved item 1");
                }
                else{
                    System.out.println("insert valid amount");
                }
                break;

            case 2:
                System.out.println("ITEM 2 selected , insert rs 30");
                amount = sc.nextInt();
                sc.nextLine();
                if(amount == 30){
                    System.out.println("u receieved item 2");
                }
                else{
                    System.out.println("insert valid amount");
                }
                break;


        }
    }while (true) ;
    }
}