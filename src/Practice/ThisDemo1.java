package Practice;

public class ThisDemo1 {
    ThisDemo1(){
//        this(10);
        System.out.println("no argument constructer ");
    }
    ThisDemo1(int a){
        this();
        System.out.println("parametrized constructer ");
    }

    public static void main(String[] args) {
        ThisDemo1 td =new ThisDemo1(10);
    }
}
