package JavaPractice;

public class JP_11_PracticeSet_loops {
    public static void main(String[] args) {
        System.out.println("Hello and welcome, print pattern numbers ");
       JP_11_PracticeSet_loops object = new JP_11_PracticeSet_loops();
       object.pattern();

    }

//    pattern print with the help of methods
    public void pattern(){
        int n = 5;
//        outer loop
        for (int i=1; i<=n; i++){
//            inner loop
            for (int j=n; j>=i; j--){
                System.out.print(" ");
            }
//            inner loop
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
