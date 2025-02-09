package Practice;
//this keyword refer to the current class reference variables

public class ThisKeyword {
    int i;
    void setNumber(int i){
        this.i = i;      // this keyword point to instance varivale i
    }
    void show(){
        System.out.println(i);
    }
}
class x {
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword();
        tk.setNumber(10);
        tk.show();
    }
}
