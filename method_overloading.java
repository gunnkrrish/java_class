class myclass{
    void m(String s){
        System.out.println("string args");
    }
    void m (Object o){
        System.out.println("object arg");
    }
}
class method_overloading{
    public static void main(String[] args) {
        myclass t = new myclass();
        Object o = new Object();
        t.m("abc");
        t.m(o);
        t.m(null);
    }
}