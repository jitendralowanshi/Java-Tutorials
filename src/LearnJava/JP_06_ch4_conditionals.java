package LearnJava;

import java.util.Scanner;

public class JP_06_ch4_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age ");
        int age = sc.nextInt();
//         int Age = 15;
          if (age >= 18){
              System.out.println("the boy can drive");
          }
          else {
             System.out.println("the boy cant drive");
          }

    }
}
