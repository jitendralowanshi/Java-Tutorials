package JavaPractice;

public class JP_17_Opps_InitializeObj {

    public static void main(String[] args) {
        /*
        java is fully object oriented programming language
        1. Clases
        2. Objeects
        3. Methods
        create class objects
        ClassName ObjectName = new ClassName();

        three ways to initialize object
        1) by using  reference variable
        2) by using method
        3) By using constructer
       */

        JP_17_Opps_InitializeObj dog = new JP_17_Opps_InitializeObj();
        dog.run();
//        Object.method with the help of dot operator
        dog.run();

    }
//    AccesModifier ReturnType ClassName (){}
    public void run(){

        System.out.println("i am eating ");
    }
}
