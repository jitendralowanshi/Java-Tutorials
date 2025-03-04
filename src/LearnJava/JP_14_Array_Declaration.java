package LearnJava;

public class JP_14_Array_Declaration {
    public static void main(String[] args) {
//        three main ways to create an array in java
//        Declaration , Memory allocation & initialization
//        array index start with 0 to (n-1) where n is the size of the array

//        1. declaration and memory allocationn
        int []marks;               // declaration
        marks = new int [5];        // Memory allocationn

        marks [0]= 90;              // Initialization
        marks [1]= 80;
        marks [2]= 70;
        marks [3]= 75;
        marks [4]= 88;
        System.out.println("first method ");
        System.out.println(marks[4]);

//        2. declaration and then memory allocation
        int []Marks = new int[5];      // Declaration + Memory allocation

        Marks [0]= 90;              // Initialization
        Marks [1]= 80;
        marks [2]= 70;
        Marks [3]= 75;
        Marks [4]= 88;
        System.out.println("second method ");
        System.out.println(Marks[0]);

//        3. declaration + memory allocation + initializatin
//           --> Array ka size java khud pata kr lega is method me

        int []arr = {90,50,60,88,91,76};

        System.out.println("third method to creat array");
        System.out.println("arr Length is = " +arr.length);
        System.out.println(arr[2]);



    }
}
