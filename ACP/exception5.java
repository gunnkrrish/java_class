package ACP;
public class exception5 {
    public static void main(String[] args){
        try{
            int result= 10*0;
        }
        catch(ArithmeticException e){
            System.out.println("catch");
        }
        finally{
            System.out.println("runs");
        }
    }
}
