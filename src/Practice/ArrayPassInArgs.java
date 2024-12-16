package Practice;
import java.util.*;

public class ArrayPassInArgs {
    public static int ArrayAsArgs(int arr[], int x){

        int k = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] != x){
                arr[k] = arr[i];
                k++;
//                System.out.println(k);
            }
        }

        for (int element: arr){
            System.out.print(element+ " ");
        }
        System.out.println();
        System.out.println("k is = "+k);
        return k;
    }




    public static void main(String[] args) {
//        int array[] = {1,2,3,4,5,6,7,8};
        int x = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Size");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter your array elements");
        for (int i=0; i<n; i+=1){
            array[i] = sc.nextInt();
//            System.out.print(Array[i] + " ");
        }

        ArrayPassInArgs.ArrayAsArgs(array,x);


    }
}
