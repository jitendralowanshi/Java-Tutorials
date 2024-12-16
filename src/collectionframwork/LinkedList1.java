package collectionframwork;
import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
//        List<Integer> list3 = new StackImpimentaion<>();
        List<Integer> list4 = new Vector<>();


        LinkedList<String> list = new LinkedList<String>();
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("jitendra");
        list.add("lowanshi");

        System.out.println(list);
        System.out.println(list.contains("jitendra"));



    }

}
