package LearnJava;

public class JP_26_Heirachical_Inheritence extends Second {
    void show3(){

        System.out.println("show3 method ");
    }
    public static void main(String[] args) {
        System.out.println("--------------------->");
        One obj = new One();
        obj.show1();
//        obj.show2();
//        obj.show3();
        System.out.println("--------------------->");
        Two obj1 = new Two();
        obj1.show1();
        obj1.show2();
//        obj.show3();
        System.out.println("--------------------->");
        JP_26_Heirachical_Inheritence obj2 = new JP_26_Heirachical_Inheritence();
        obj2.show1();
        obj2.show2();
        obj2.show3();

    }
}
class First {
    void show1(){
        System.out.println("Show1 method ");
    }
}
class Second extends First {
    void show2(){
        System.out.println("show2 method ");
    }
}
