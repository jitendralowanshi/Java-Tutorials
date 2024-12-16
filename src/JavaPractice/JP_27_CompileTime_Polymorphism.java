package JavaPractice;

/*
   two Types of Polymorphism
   1. run time polymorphism / Static polymorphism
       you can achive by using Method Overloading
      1. same name ki method
      2. same class ke ander
      3. diffrent arguments

   2. compile time polymorphism / Dynamic polymorphism
       Achieve by using Method OverRidding
    */
public class JP_27_CompileTime_Polymorphism {
    void show () {
        System.out.println("first method ");
    }
    void show(String s) {
        System.out.println("com.company.Second method ");
    }
    void show(int a,int b) {
        System.out.println("third method ");
    }
    public static void main(String[] args) {
        JP_27_CompileTime_Polymorphism obj = new JP_27_CompileTime_Polymorphism();
        obj.show();
        obj.show("jitendra");
        obj.show(70,30);
    }
}
