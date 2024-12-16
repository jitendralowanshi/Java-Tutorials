package Practice;

public class ThisDemo {
    void display(){
        System.out.println(" This is display method call  ");
    }
    void show(){
        this.display();    // calling from another method for using this keyword
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.show();
//        this.display();    // non static content so yaha se method call nhi kr sakte hai
    }
}
