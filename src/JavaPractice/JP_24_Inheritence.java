package JavaPractice;

public class JP_24_Inheritence {
    /*
     Types of inheritence
     1. Single inheritence
     2. Multi level  inheritence
     3. heirarichal inheritence

     this two inheritance not used in java
     4. multiple inheritence
     5. Hybrid inheritance
     */
//    single inheritence
   public void methodA(){
        System.out.println("class a method ");
    }
    public static void main(String[] args) {
//        com.company.JP_24_Inheritence obj = new com.company.JP_24_Inheritence();
//        obj.a();
        B obj = new B();
        obj.methodA();
        obj.methodB();
    }
}
class B extends JP_24_Inheritence{
    void methodB(){
        System.out.println("class b method");
    }

}
