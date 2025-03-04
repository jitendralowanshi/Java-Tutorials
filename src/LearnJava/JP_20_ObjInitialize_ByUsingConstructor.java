package LearnJava;

public class JP_20_ObjInitialize_ByUsingConstructor {
    /*
                       constructer use to initialize an object

       1. constructor is a block similar to a method having same name as that of class name
       --> class ka name and method ka name same hona chahiye
       2. Constructor does not have any return type not even void.
       --> cons. koi bhi return type nhi hota hai or sath me void bhi nhi hota hai
       3. the only Acces modifieres  applicable for constructor are public , private , protected & default.
       --> constructer use ke liye only 4 modifiers use kr sakte hai public , private ,protected & default
       4. it execute automatically when we create an object
    */
    String name;
    int emp_id;
//    Create parameterized constructor
public JP_20_ObjInitialize_ByUsingConstructor(String name,int emp_id){
    this.name=name;
    this.emp_id=emp_id;
}

    public static void main(String[] args) {
        JP_20_ObjInitialize_ByUsingConstructor e1 = new JP_20_ObjInitialize_ByUsingConstructor("Jitendra",101);
        JP_20_ObjInitialize_ByUsingConstructor e2 = new JP_20_ObjInitialize_ByUsingConstructor("Mahendra",102);
        System.out.println("Employee 1 : "+e1.name+" "+e1.emp_id);
        System.out.println("Employee 2 : "+e2.name+" "+e2.emp_id);
    }
}
