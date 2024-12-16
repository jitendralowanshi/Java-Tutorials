package Practice;

import java.util.Scanner;

public class FactorialNumbers {
    // its Constructer
   public FactorialNumbers(){       //user define constructer
       System.out.println("it is constructer calling from constructer method  ");


   }

    public static void fact(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your factorial NUmbers ");
        int num = sc.nextInt();

        int fact = 1 ;
        for (int i=1; i<=num; i += 1){   // i++ ===> i = i+1 ====>  i += 1;
            fact = fact * i;
//            System.out.println(fact );
        }
        System.out.println(fact);
        sc.close();
    }

    public static void main(String[] args) {
        FactorialNumbers.fact();
        FactorialNumbers fn = new FactorialNumbers();

    }
}
