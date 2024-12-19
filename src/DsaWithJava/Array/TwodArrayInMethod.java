package DsaWithJava.Array;
import java.util.*;

public class TwodArrayInMethod {
    public static void twoDArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your rows number");
        int rows = sc.nextInt();

        System.out.println("enter your cols number");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

//        input to the user
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

//        output
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int[][] arrTwo = {};
        twoDArray();
    }
}
