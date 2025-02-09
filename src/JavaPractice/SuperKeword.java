package JavaPractice;

public class SuperKeword {
//    Super is also a refference variable
//    super keyword is reference variable which is used to refer immediate parent class object/

   int a = 10;  // super print 10
}
class SuperSub extends SuperKeword {
        int a =20;  // this Print 20
        void show(int a){
            System.out.println(" method print local variable value       = " + a); // Print 30
            System.out.println(" this print current class variable value = "+ this.a);   // this refer to the current class instance variable
            System.out.println(" super print parent class variable value = "+super.a);   // super refer to the parent class instance variable or extend class =n
        }

    public static void main(String[] args) {
      SuperSub ss = new SuperSub();
      ss.show(30);
    }
}
