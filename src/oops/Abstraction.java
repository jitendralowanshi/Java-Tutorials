package oops;


 abstract class Abstraction {
     int noOfTyres;             //fields
  abstract void start();        // Abstract method
}

class Car extends Abstraction {
     void start(){                      // abstract method body
         System.out.println("car start with key");
     }
}

class Scooter extends Abstraction {
     void start(){
         System.out.println("scooter start with kick");
     }

    public static void main(String[] args) {
//         Abstraction a = new Abstraction();
//         a.start();

        Scooter s = new Scooter();
        s.start();

        Car c = new Car();
        c.start();
    }
}
