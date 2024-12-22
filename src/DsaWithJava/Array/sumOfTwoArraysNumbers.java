package DsaWithJava.Array;

public class sumOfTwoArraysNumbers {
    static void sumOfTwoNumbers(int[] arr) {
        for (int sum: arr) {
            System.out.print(sum + " ");
        }
        System.out.println();

        int s = 120;
        for (int i=0; i<arr.length; i++) {
            for (int j=arr.length-1; j>0; j--) {
                int sum1 = arr[i] + arr[j];
                if (sum1 == s ) {
                    if (i == j) {
                        return;
                    }
                    System.out.println("index is " + i+ "," + j );
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80};
        sumOfTwoNumbers(arr);

    }
}
