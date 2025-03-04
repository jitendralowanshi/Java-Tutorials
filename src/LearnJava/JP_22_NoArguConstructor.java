package LearnJava;

public class JP_22_NoArguConstructor {
//user define constructor --> No arguments Constructor
    String name;
    int age;
//    Create Constructor
//    AccesModifieres ClassName/Methodname
     public JP_22_NoArguConstructor(){
        System.out.println("No Argument Constructor");
    }

    public static void main(String[] args) {

        JP_22_NoArguConstructor obj = new JP_22_NoArguConstructor();
    }
}
