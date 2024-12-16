package Practice;
//interface support multiple inheritence in java

public interface ByUsingInterface {
    public abstract void show();
    public abstract void display();
   default void run(){
        System.out.println("my name is jitendra lowansshi");
    }
}

interface I2 {
    void run();
}

class Test implements ByUsingInterface ,I2{

    public void run(){
        System.out.println("calling from run method ");
    }
    public void show(){
        System.out.println("it's show method calling ");
    }
    public void display(){
        System.out.println("it's display method calling ");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
        t.run();

    }
}
