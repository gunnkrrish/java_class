package ACP;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperName{
    String name();
    String date();
    String version();
}

@DeveloperName(
    name = "gunn",
    date = "2025-07-04",
    version = "1.0"
)

class project{
    void info(){
        System.out.println("detailssss");
    }
}
public class annotationseg5 {
    public static void main(String[] args) {
         Class<?> clazz=project.class;
        if(clazz.isAnnotationPresent(DeveloperName.class)){
            DeveloperName dev=clazz.getAnnotation(DeveloperName.class);
            System.out.println("Name: " + dev.name());
            System.out.println("Date: " + dev.date());
            System.out.println("Version: " + dev.version());
        } else {
            System.out.println("No Developer annotation present.");
    }


    }
}
