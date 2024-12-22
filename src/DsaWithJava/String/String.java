package DsaWithJava.String;

public class String {
  static void sumOfTwoNumbers(int[] arr) {
        int s = 12;
        for (int i=0; i<arr.length; i++) {
            for (int j=arr.length; j>0; j--) {
                if (s == (i+j)) {
                    System.out.println(arr[i]+ " "+ arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        sumOfTwoNumbers(arr);
    }
}
 