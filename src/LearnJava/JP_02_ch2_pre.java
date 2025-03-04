package LearnJava;

public class JP_02_ch2_pre {
    public static void main(String[] args) {

//        Precedense & Associativity

        int a = 6*5-34/2;         //   */+-  first come first serve
    /*
         = 30-17                 // from presedence table
         = 13

    */
        int b = 60/5-34*2;         //  /*+-  First come first serve
    /*
        = 12-64
        = -56
    */
        System.out.println(a);
        System.out.println(b);

    }
}
