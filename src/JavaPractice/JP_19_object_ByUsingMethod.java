package JavaPractice;

public class JP_19_object_ByUsingMethod {
//    2. By Using method
    String color;
    int age;
    public void initObj(String c, int a){
        color = c;
        age = a;
        System.out.println(color+" "+age);
    }
//    void display(){
//        System.out.println(color+" "+age);
//    }

    public static void main(String[] args) {
        JP_19_object_ByUsingMethod obj=new JP_19_object_ByUsingMethod();
        obj.initObj("black",18);
//        obj.display();

    }
}
