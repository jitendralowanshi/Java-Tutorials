package JavaPractice;

public class JP_18_Object_ReferenceVariable {
//    object initialize by using reference varible
    String colour;
    int age;

    public static void main(String[] args) {
        JP_18_Object_ReferenceVariable Object = new JP_18_Object_ReferenceVariable();
        Object.colour = "black";
        Object.age = 10;
        System.out.println(Object.colour+" "+Object.age);
    }
}
