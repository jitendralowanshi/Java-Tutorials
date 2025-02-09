package JavaPractice;

public class JP_12_practiceSet_loops {
    public static void main(String[] args) {
        int n = 5;
//        outer loop
        for (int i=1; i<=n; i++){
//            inner loop for spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
//            second inner loop for half numbers
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            for (int j=2; j<=i; j++){
                System.out.print(j );
            }
            System.out.println();

        }

/*
  outer loop
        for (int i=1; i<=n; i++){
//            inner loop
        for (int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for (int j=i; j>=1; j--){
            System.out.print(j);
        }
//            inner loop
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
 */

    }
}
