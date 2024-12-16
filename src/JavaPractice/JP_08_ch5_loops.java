package JavaPractice;

public class JP_08_ch5_loops {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
//                inner loop 1
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
//                inner loop 2
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("This statement is Ended ");

//        int N = 5;
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
    }
}
