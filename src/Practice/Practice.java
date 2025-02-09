package Practice;

import java.util.Scanner;

public class Practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your decimal number ");
        int num = sc.nextInt();
        String b = " ";
        int temp = num;

        while(temp>0){
            int rem = temp % 2;
            temp = temp / 2;
            b = rem + b;
        }

        int ans = 0;
        for(int i = 0; i<b.length(); i++){
            ans+= Character.getNumericValue(b.charAt(i));
        }
        System.out.println(" binary number is " + b);
        System.out.println(ans);
    }
}
