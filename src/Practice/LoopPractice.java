package Practice;

public class LoopPractice {
    public static void main(String[] args) {
      int n =6;

      for (int i=0; i<=n; i++){

          for (int j = 0; j < 5 ; j++) {
              if (i<1 && j<4){
                  System.out.print("*");
              }
//              System.out.print("*");
          }
          System.out.println();
      }

    }
}
