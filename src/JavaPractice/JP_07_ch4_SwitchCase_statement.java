package JavaPractice;

import java.util.Scanner;

public class JP_07_ch4_SwitchCase_statement {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age  ");
        age = sc.nextInt();
        switch (age) {
            case 18 :
                System.out.println("you are going to become adult");
                break;
            case 20:
                System.out.println("you are join a job ");
                break;
            case 68:
                System.out.println("you are going to gate retaired ");
                break;
            default :
                System.out.println("you are out in switch case statement");
        }

    }
}
