package LearnJava;

abstract class JP_29_Abstraction {
    abstract void start();
}


class Car extends JP_29_Abstraction {
    void start(){
        System.out.println(" Car Start with key");
    }
}


class bike extends JP_29_Abstraction {
    void start(){
        System.out.println(" Bike start with kick");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        bike b = new bike();
        b.start();
    }
}
