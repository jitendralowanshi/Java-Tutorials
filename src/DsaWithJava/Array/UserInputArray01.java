package DsaWithJava.Array;

import java.util.Scanner;

public class UserInputArray01 {
    public static void userInputArr() {
        Scanner sc = new Scanner(System.in);

//        user input array size
        System.out.println("enter Your array size");
        int size = sc.nextInt();

        int[] num = new int[size];

//        user input array
        for (int i=0; i<num.length; i++) {
            num[i] = sc.nextInt();
        }

//        find number x in index
        int x = sc.nextInt();


//        output
        for (int i=0; i<num.length; i++) {
            if (num[i] == x ){
                System.out.println(x +" in index " + i);
            }
        }
    }

    public static void main(String[] args) {
        userInputArr();
    }
}
