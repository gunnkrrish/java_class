import java.util.*; 
import java.util.function.Predicate; 
import java.util.stream.Collectors; 
 
public class highorder { 
    public static void main(String[] args) { 
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David"); 
 
        List<String> result = filterList(names, name -> name.startsWith("A")); 
        System.out.println(result); // [Alice] 
    } 
 
    public static List<String> filterList(List<String> list, Predicate<String> predicate) { 
        return list.stream() 
                   .filter(predicate) 
                   .collect(Collectors.toList()); 
    } 
} 
