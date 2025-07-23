package ACP;
class Parent {
    public void greets(){
        System.out.println("hello from parent");
    }
}
class child extends Parent{
     public void greetss(){
        System.out.println("hello from child");
    }
}
public class annotations5 {
    public static void main(String[] args) {
        Parent obj = new child();
        obj.greets();
    }
}
