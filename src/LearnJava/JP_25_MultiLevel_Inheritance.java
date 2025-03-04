package LearnJava;

public class JP_25_MultiLevel_Inheritance extends Two {
    void show3()
    {
        System.out.println("show3 method  ");
    }
    public static void main(String[] args) {
        System.out.println("class one ka obj ke trough");
        One obj = new One();
        obj.show1();
//        obj.show2();
//        obj.show3();
        System.out.println("class two ke obj ke trough");
        Two obj1 = new Two();
        obj1.show1();
        obj1.show2();
//        obj1.show3();
        System.out.println("class main method ke obj ke trough");

        JP_25_MultiLevel_Inheritance obj2 = new JP_25_MultiLevel_Inheritance();
        obj2.show1();
        obj2.show2();
        obj2.show3();

    }
}
class One{
    void show1(){

        System.out.println("show1 method");
    }
}
class  Two extends One{
    void show2(){

        System.out.println("show2 method ");
    }

}

