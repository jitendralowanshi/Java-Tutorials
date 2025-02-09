package JavaPractice;
import java.util.Scanner;

public class JP_00_ch1_takingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fisrt Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is : " +sum);

    }
}
