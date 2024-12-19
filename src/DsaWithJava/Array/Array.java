package DsaWithJava.Array;
import java.util.*;

public class Array {
   public static void matrix () {
       Scanner sc = new Scanner(System.in);

       System.out.println("enter first number");
       int row = sc.nextInt();
       System.out.println("enter second number");
       int col = sc.nextInt();

       int[][] arr = new int[row][col];

       for (int i = 0; i<row; i++) {
           for (int j = 0; j<col; j++) {
//               arr [i][j] = sc.nextInt();
               System.out.print(arr[i][j]+ " ");
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
        matrix();

    }
}
