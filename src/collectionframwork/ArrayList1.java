package collectionframwork;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

        System.out.println(list);
        System.out.println(list.contains(40));   // 50 contain or not in the list if contain then return true otherwise false
        System.out.println("remove at 3rd index value : "+list.remove(3));  //remove values as index number values

//        int remove = Integer.valueOf(50);
//        System.out.println(Integer.valueOf(40));



        System.out.println("updated list are "+list);

    }
}
