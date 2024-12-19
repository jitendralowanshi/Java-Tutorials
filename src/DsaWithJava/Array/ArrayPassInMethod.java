package DsaWithJava.Array;

public class ArrayPassInMethod {
    public static void arrPass(int[] number){

        for (int i=0; i<number.length; i++) {
//            System.out.println("index " + i +" = "+number[i]);
            System.out.println(number[i]);

        }
    }

    public static void main(String[] args) {
        int[] number = { 10,20,30,40,50,60 };

//        System.out.println("array accupie default spaces");
//        for (int i=0; i<number.length; i++){
//            System.out.print(i+" ");
//        }
//        System.out.println();


        arrPass(number);
    }
}
