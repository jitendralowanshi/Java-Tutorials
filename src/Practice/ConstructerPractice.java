package Practice;

public class ConstructerPractice {
    String name;
    long empId;
    ConstructerPractice(String name, long empId){
        this.name = name;
        this.empId = empId;
    }
//    public ConstructerPractice(){
//        System.out.println("my name is jitendra lowanshi");
////        System.out.println(name);
////        System.out.println(empId);
//    }
    public static void main(String[] args) {
        ConstructerPractice cp = new ConstructerPractice("jitendra", 735483767);
//         cp.name = "jitendra";
//         cp.empId = 101;
        System.out.println(cp.name);
        System.out.println(cp.empId);
    }
}
