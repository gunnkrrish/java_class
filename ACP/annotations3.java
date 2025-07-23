package ACP;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperName{
    String title();
    String author();
   
}

@DeveloperName(
   title = "gunn",
    author = "khurana"
)

class project{
    void info(){
        System.out.println("detailssss");
    }
}
public class annotations3 {
    public static void main(String[] args) {
         Class<?> clazz=project.class;
        if(clazz.isAnnotationPresent(DeveloperName.class)){
            DeveloperName dev=clazz.getAnnotation(DeveloperName.class);
            System.out.println("Title: " + dev.title());
            System.out.println("Author: " + dev.author());
        } else {
            System.out.println("No Developer annotation present.");
    }


    }
}

