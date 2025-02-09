package oops;

public class ClassObjectMethods01 extends SecondClass {
    static void display(){
        System.out.println("this is method ");
    }
    public static void main(String[] args) {
//        ClassObjectMethods ob = new ClassObjectMethods();
        display();
//        B obj = new B();
            sum();

    }
}
class SecondClass {
     static void sum(){
        System.out.println("apna college");
    }
}

