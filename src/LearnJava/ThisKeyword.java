package LearnJava;

public class ThisKeyword {
//    this Keyword is a refference variable for reffer instance variabl
//    this reffer to the current class instance variable

//    instance variable
    int i;
//    Setter method set values for instance variable i.
    void setValues(int i){
//        i = i;           this condition print default values for = 0
        this.i = i;     // this reffer to the current class instance variable
    }
    void show(){
        System.out.println(i); // print 10
    }
}

class  Sub {
    public static void main(String[] args) {
        ThisKeyword k = new ThisKeyword();
        k.setValues(10);
        k.show();
    }
}