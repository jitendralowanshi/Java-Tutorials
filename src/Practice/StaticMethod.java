package Practice;

public class StaticMethod {

    public static void run(){
        System.out.println("its static method call");
    }
    public static void main(String[] args) {
        StaticMethod.run();
        Another.show();
        Another.run2();

    }
}
class Another{
    public static void show(){
        System.out.println("it's another class static method ");
    }
    static int run2(){
        System.out.println("its Another call run2 method call");
        return -1;
    }
}
