package DsaWithJava.Array;

public class sumOfTwoArraysNumbers {
    static int[] sumOfTwoNumbers(int[] arr) {
        for (int sum: arr) {
            System.out.print(sum + " ");
        }
        System.out.println();

        int target = 120;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]+arr[j] == target ) {

//                    System.out.println("index is " + i+ "," + j );
                    return new int[]{i,j}; //this use in leetcoede problems
//                  return new array with initialize
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80};
        sumOfTwoNumbers(arr);

    }
}
