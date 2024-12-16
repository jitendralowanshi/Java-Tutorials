package Practice;
abstract class AbstractClass {
    abstract void show();
    abstract void display();

//    void display {
//        System.out.println("2");
//    }
}
class Car extends AbstractClass {
    void show(){
        System.out.println("Car start with key ");
    }
   public void display(){

    }

}
class Scooter extends  AbstractClass {
    void show(){
        System.out.println("Scooter start with kick ");
    }
    public void display(){

    }

    public static void main(String[] args) {
//        AbstractClass ac = new AbstractClass() {
//        we cant create abstract class object
//            @Override
//            void show() {
//
//            }
//
//            @Override
//            void display() {
//
//            }
//        }


        Car c = new Car();
        c.show();

        Scooter s = new Scooter();
        s.show();
    }
}

