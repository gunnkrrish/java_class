package ACP;
import java.util.function.Predicate;

class validemail{
    public static void main(String[] args) {
        Predicate<String> isvalid = email-> email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

        String[] testEmails={
            "mustakim.shaikh@gmail.com",
            "john.doe@",
            "abc123@domain.co.in", 
        };

        for(String email: testEmails){
            if(isvalid.test(email)){

                System.out.println("Valid email");
            }else{
                System.out.println(isvalid.test((email)));
                System.out.println("not valid");
            }
        }
    }
}