package LearnJava;

public class JP_13_practiceset {
    public static void main(String[] args) {
        int n = 4;
//        outer loop
        for (int i=1; i<=n; i++){
//            inner loops for spaces
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
//            second inner loop
            for (int j=1; j<=i; j++){
                System.out.print(" *");
            }
            for (int j=2; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
//        System.out.println();

//        second half part
        for (int i=n; i>=1; i--){
//            inner loops
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
//            second inner loop
            for (int j=1; j<=i; j++){
                System.out.print(" *");
            }
            for (int j=2; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
