package Practice;

// import packageName dot ClassName ;  import package to another package .
import JavaPractice.JP_28_RunTime_polymorphism;
import JavaPractice.JP_24_Inheritence;

public class ImportPackageToAnotherClass {
    public static void main(String[] args) {
        JP_24_Inheritence ab = new JP_24_Inheritence();
        ab.methodA();

        JP_28_RunTime_polymorphism abc = new JP_28_RunTime_polymorphism();
        abc.show();





    }
}
