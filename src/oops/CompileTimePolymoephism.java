package oops;



public class CompileTimePolymoephism {
    //Static Polymorphism
    //Method Overloading
    void show(){
        System.out.println("one");
    }   
    void show(int a){
        System.out.println("two");
    }
    public static void main(String[] args) {
        CompileTimePolymoephism cp = new CompileTimePolymoephism();
        cp.show();
        cp.show(20);
    }
}
