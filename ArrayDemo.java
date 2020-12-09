package corejava;

public class ArrayDemo {
    public static void main(String[] args) { //shortcut psvm or main Ctrl+space

     int[] myIntArray1;
     myIntArray1 = new int[10];

     myIntArray1[0] =100;
     myIntArray1[1] =200;

        System.out.println("0 index:  " + myIntArray1[0]);
        System.out.println("1st index:  " + myIntArray1[1]);
        System.out.println("2nd index:  " + myIntArray1[2]);

     String [] myStringArray1 = {"London" ,"Scotland","Wales","Northern Ireland"};
        System.out.println("0 index: " + myStringArray1[0]);
        System.out.println("1st index:  " + myStringArray1[1]);
        System.out.println("2nd index:  " + myStringArray1[2]);
        System.out.println("3st index:  " + myStringArray1[3]);

        int len1 = myIntArray1.length;
        int len2 = myStringArray1.length;
        System.out.println("int array length: " + len1);
        System.out.println("String array length: " + len2);













    }








}
