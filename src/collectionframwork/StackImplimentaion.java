package collectionframwork;

import java.util.Stack;

public class StackImplimentaion {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<Integer>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);

        System.out.println(list);
        System.out.println(list.peek());
        list.pop();

        System.out.println(list);
        System.out.println(list.peek());
        list.pop();

        System.out.println(list);
        System.out.println(list.peek());
        list.pop();

        System.out.println("final list is "+list);
        list.push(10);
        System.out.println(list);


    }
}
