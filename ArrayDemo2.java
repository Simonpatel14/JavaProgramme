package corejava;
 import java.util.*;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int[] array = {1, 2};
       /* int[] array;
        array = new int[10];
        array[0] =1;
        array[1] =2;*/
        System.out.println(array[0]);
        System.out.println(array[1]);
        // System.out.println(array[2]);


        String[] stringarray1 = {"Rose", "Sunflower", "Daisy"};// by mentioning value for array in same line use {} and not()
        System.out.println("0 index value:" + stringarray1[0]);
        System.out.println("1 Index Value:" + stringarray1[1]);
        System.out.println("2 Index Value: " + stringarray1[2]);

        int len1 = array.length;
        int len2 = stringarray1.length;

        System.out.println("int  array length: " + len1);
        System.out.println("String  array length: " + len2);


        for (int i = 0; i < len1; i++) ;
        {
            // System.out.println(array[i]);
        }

        Arrays.sort(array);
        for (int i = 0; i < len1; i++) ;
        {
            // System.out.println(array[i]);
        }
        //System.arraycopy(src, srcPos,dest, destPos, length);

        String hungry = "are you hungry";
        if (hungry == "no") ;
        {

            System.out.println("Eat samosa");
        }


    }
}











