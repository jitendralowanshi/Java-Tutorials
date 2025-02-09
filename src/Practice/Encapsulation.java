package Practice;

public class Encapsulation {
    private int empid;

    public void setEmpid(int empid){
        this.empid=empid;
        System.out.println();
    }
    public int getEmpid(){
        return this.empid;
    }
}
class xyz   {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}
