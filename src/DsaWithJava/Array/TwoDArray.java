package DsaWithJava.Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your rows number");
        int rows = sc.nextInt();

        System.out.println("Enter Your column Number");
        int cols = sc.nextInt();

        int [][]arr = new int[rows][cols];

//        input array
//        innerloop
        for (int i=0; i<rows; i++){
//            outerloop
            for (int j=0; j<cols; j++){
                 arr[i][j] = sc.nextInt();
//                System.out.print(arr[i][j] + " ");
            }
        }
//        find value in matrix
        System.out.println("enter Your found number");
        int x = sc.nextInt();

        System.out.println("Your Two Dimantional Arrays is ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println("length is " + arr.length);




        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (arr[i][j] == x) {
                    System.out.println("x is index of "+ i +" , "+ j);
                }
            }
        }

    }
}
