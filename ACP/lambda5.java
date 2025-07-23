package ACP;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class lambda5 {
    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(5,10,15,20);
        // System.out.println("even num are: ");
        // Predicate<Integer> isEven = (Integer n) -> n % 2 == 0;
        // numbers.stream()
        //         .filter(isEven)
        //         .forEach(System.out::println);


         List<String> names = Arrays.asList("gunn","khurana","okieeeee","ok");
        System.out.println("short num are: ");
        Predicate<String> check = (String n) -> n.length() <= 4;
        names.stream()
                .filter(check)
                .forEach(n-> System.out.println(n));

    }
}
