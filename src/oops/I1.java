package oops;

interface I1 {
    /*
    public abstract void show();      // by default public abstract laga deta hai

    public static final int a = 10;    //by default public static final laga deta hai

    default void display(){
        //interface ke inder concrite method bhi aa sakta hai lekin uska access modifier default hona chahiye.
    }

    static  void run(){    //static method ka access modifier always public hona chahiye.
    }
     */
     void show();


}
interface I2 {
    void display();
}


class Test implements I1, I2 {
   public void show(){
        System.out.println("this is a interface = i1 ");
    }
    public void display(){
        System.out.println("this is interface i2");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }
}

