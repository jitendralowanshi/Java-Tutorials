package JavaPractice;

public class JP_01_ch2_Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int sum = a + b;
//        int sum = a - b;
//        System.out.println("The total sum is : " +sum);


        int modulo = 15 % 4;
        System.out.println(modulo);
        System.out.println("the operators is End");

        int c = 9;
        b += 6;            //   b=b+6
        System.out.println(c);
        System.out.println(b);

//        comparison operators
        System.out.println( 64>98 && 64>5 );  // if both are true then ans true otherwise false
        System.out.println( 64>98 || 64>5 );    // if any one true then ans is true



    }
}
