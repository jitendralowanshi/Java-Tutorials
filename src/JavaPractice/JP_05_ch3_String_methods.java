package JavaPractice;

public class JP_05_ch3_String_methods {
    public static void main(String[] args) {

        String sName = "jitendra";
//        int value = sName.length();
//        System.out.println(value);
        System.out.println(sName.length()); //1

        String name = "LOWANSHI";
        System.out.println(name.toLowerCase()); //2
        System.out.println(sName.toUpperCase()); //3

//       4)  trim() method
        String noneTrimmedString = "   jitendra    ";
        System.out.println(noneTrimmedString);

        String trimmedString = noneTrimmedString.trim();
        System.out.println(trimmedString);

//        5) variableName.substring(int start);
        System.out.println(sName.substring(3));

//        6) variableName.substring(int start, int end);
        System.out.println("6) "+sName.substring(2,5));

//        7) variableName.replace('Oldchar','Newchar');
        System.out.println(sName.replace('i','e'));

//        8) variableName.replace('OldString','Newstring');
        System.out.println(sName.replace("ten","lowanshi"));

//        9) variableName.startswith();
        System.out.println(sName.startsWith("jit"));

//        10) variableName.endswith();
        System.out.println(sName.endsWith("dra"));
    }
}
