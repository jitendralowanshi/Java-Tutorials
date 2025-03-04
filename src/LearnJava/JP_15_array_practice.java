package LearnJava;

public class JP_15_array_practice {
    public static void main(String[] args) {

//        int marks[] = new int[];
        int marks [] = {90,80,70,85,79};

        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
//        for each loops
//        this is very sinple loop for printing array
        System.out.println("Printing using for-each loop ");
        for (int element : marks){            // Array name include only for each loop
            System.out.println(element);
        }

        System.out.println("Thanks for exploring java tutorials ");
    }
}
