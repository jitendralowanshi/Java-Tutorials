package JavaPractice;

/*
        Run time Polymorphism / Dynamic polymorphism
        achieve Method Overriding
        1.same method names
        2.different classes
        3.same arguments
   */
public class JP_28_RunTime_polymorphism {
   public void show() {
        System.out.println("1");
    }
    public static void main(String[] args) {
        System.out.println("Polymorphism in java / its run time polymorpism :");
        JP_28_RunTime_polymorphism obj = new Xyz();
//        Xyz1 obj2 = new Xyz1();
        obj.show();
        Xyz obj1 = new Xyz();
        obj1.show();
//        obj2.show();
    }
}
class Xyz extends JP_28_RunTime_polymorphism {
   public void show() {
        System.out.println("2");
    }
}

//class Xyz1 extends com.company.JP_28_RunTime_polymorphism {
//    void show() {
//        System.out.println("3");
//    }
//}

