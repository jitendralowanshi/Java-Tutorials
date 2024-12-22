package DsaWithJava.Array;

import java.util.Scanner;

public class sumOfThreeArrNum {
    public static void sumOfTwoArr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sumOf Number");
        int sumOf = sc.nextInt();

        for (int i=0; i<arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {

                    if ((arr[i]+arr[j]+arr[k]) == sumOf) {

                        if (i!=j && i!=k && j!=k) {
                            System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                        }

                    }


                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        sumOfTwoArr(arr);

    }
}
