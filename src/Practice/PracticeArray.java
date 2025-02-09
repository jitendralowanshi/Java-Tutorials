package Practice;

import java.util.ArrayList;
import java.util.Scanner;

class PracticeArray {

    public static void list(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size  ");
        int n = sc.nextInt();
        System.out.println("Enter your Array Elements ");
        int []arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+ " ");
//          sc.close(); exeption are ahead
        }
        System.out.println();
    }

    public static void arrayListPractice(){
        System.out.println("Enter your ArrayList");
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.isEmpty());
//        for (int elementl: list){
//            System.out.print(elementl+ " ");
//        }
//        System.out.println(list);

    }

    public static void main(String[] args) {
        PracticeArray.list();
        PracticeArray.arrayListPractice();


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your array size");
//        int n = sc.nextInt();
//        int []arr = new int[n];
//
//        for (int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//            System.out.print(arr[i]+ " ");
//        }


    }
}
