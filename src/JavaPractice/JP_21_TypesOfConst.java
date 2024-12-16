package JavaPractice;

public class JP_21_TypesOfConst {
     /*
         Three types of constructor
         1. Default consructor ,but No arguments constroctor
         2. User define constructor - No argument constructor.
         3. User Define constructor - Parameterized Constructor
    */
    String name;
    int age;
//Defaul constructor
    public static void main(String[] args) {
        JP_21_TypesOfConst obj = new JP_21_TypesOfConst();
        System.out.println("Default constructor = "+obj.name+" "+obj.age);



    }
}
