package collectionframwork;

import java.util.HashSet;
// A collection that  does's not allow duplicate elements.
//this data structure not allow duplicate and repeat elements .

public class HashSetImp {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(3);

        System.out.println(set);

        set.remove(4);
        System.out.println(set);

        set.remove(1);
        System.out.println(set);

    }
}
