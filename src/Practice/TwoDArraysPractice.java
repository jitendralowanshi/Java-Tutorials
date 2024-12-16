package Practice;
import java.util.Scanner;


public class TwoDArraysPractice {

    public static void twoDimentionalArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row ");
        int rows = sc.nextInt();
        System.out.println("Enter your Column");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for (int i=0; i<rows; i++){
            for (int j = 0; j < cols; j++) {
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

//        System.out.println("Your two Dimentional array is ");
//        for (int i=0; i<rows; i++){
//            for (int j = 0; j < cols; j++) {
////                arr[i][j]=sc.nextInt();
//                System.out.print(arr[i][j]+ " ");
//            }
//
//            System.out.println();
//        }
    }

    public static void main(String[] args) {
        TwoDArraysPractice.twoDimentionalArray();

    }
}
