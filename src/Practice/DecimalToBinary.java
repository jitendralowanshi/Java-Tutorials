package Practice;

import java.util.Scanner;
public class DecimalToBinary {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Decimal number");
        int num = sc.nextInt();

        String b = "";
        int temp = num;

        while(temp>0){
            int rem = temp % 2;
            temp = temp / 2;
            b = rem + b;
        }
        System.out.println(" your binary number is "+b);
        

    }
}
