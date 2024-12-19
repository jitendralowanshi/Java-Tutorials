package DsaWithJava.Array;

public class ArrayDeclaration00 {
    public static void arrDeclare() {
        int[] marks = new int[5];
        marks[0] = 97;   //initialization
        marks[1] = 98;
        marks[2] = 87;
        marks[3] = 70;
        marks[4] = 95;
//        System.out.println(marks[0]);

        for (int i=0; i<marks.length; i++ ){
            System.out.println("Index " + i + " = " + " " + marks[i]);
        }

    }
    public static void main(String[] args) {
        arrDeclare();
    }
}
