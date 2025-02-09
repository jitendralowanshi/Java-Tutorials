package JavaPractice;

public class JP_23_ParametrizedConstructor  {
//    third parameterized constructor
    String name;
    int age;
    float id;
//    constructer
    public JP_23_ParametrizedConstructor(String name,int age, float id){
       this.name=name;
       this.age=age;
       this.id=id;
        System.out.println("Parametorized Constructor");
    }


    public static void main(String[] args) {
        JP_23_ParametrizedConstructor obj = new JP_23_ParametrizedConstructor("jitendra",24, 19.2345f);

    }
}

