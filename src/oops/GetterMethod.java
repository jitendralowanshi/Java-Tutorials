package oops;

public class GetterMethod {
//    Getter method used in encapsulasion for data recure
//    and privacy secure
    private int age;

    public void setAge(int age){
        if(age < 25){
            System.out.println("yoou are not enter the main gate");
            this.age = age;
        }

    }


    public int getAge(){
        return this.age;
    }
}
class AnotherOne {
    public static void main(String [] args){
        GetterMethod gm = new GetterMethod();
        gm.setAge(24);
        gm.getAge();
        System.out.println(gm.getAge());


    }
}
