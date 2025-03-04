package LearnJava;

public class JP_16_Multidimentional_Arrays {
    public static void main(String[] args) {
//        multidimetional array two d and three d arrays
//        2-D arrays
        int [][]arr = {{20,30,40},{70,80,85},{96,99,88}};
        System.out.println(arr[0][0]);

//        2-D Arrays
        int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};        // {1,2,3}=I0  and  1=j0 , 2=j1 ,3=j3
        System.out.println(arr1[0][0]);                  //  {4,5,6}=I1  and  4=j0 , 5=j1 ,6=j3
                                                        //   {7,8,9}=I2  and  7=j0 , 8=j1 ,9=j3
    }
}
