package corejava;

public class OperatorsInJava1 {
    //Arithmetic Operators : + - * / %
    //Relational Operators : (Comparison Operators) :   ==   <>  <=   >=  !=
    //Logical Operators:    &&  ||   !
    //Increment/Decrement Operators : ++  --
    //Assignment Operators :  =

    public static void swapValue() {
        int c=20;
        int d=40;
        int swap;    //declaration
        swap=c;      //20
        c=d;         //40
        d=swap;
        System.out.println("swap value d to c: "  + c);
        System.out.println("Swap Value c to d: "  +d);

    }

    public static void main(String[] args) {   //short cut to main method main ctrl+space and enter or psvm

        //Arithmetic Operators : + - * / %
        int a = 10;

        int b = 20;

        //Written as a " is string And + use to concatenate and for addition as well"
        System.out.println("Sum of a and b:" + (a+b));
        System.out.println("Diff of b and a:" + (b-a));
        System.out.println("multiply of a and b:" + (a*b));
        System.out.println("Division of b and a:" + (b/a));
        System.out.println("mod Div of a and b: "  + (a%b));


        //Relational Operators : (Comparison Operators) :   ==   <>  <=   >=  !=
        //always written boolean value
        System.out.println("relational Operators: " + (a==b));//false
        System.out.println("relational Operators: " + (a<b));//true
        System.out.println("relational Operators: " + (a>b)); //false
        System.out.println("relational Operators: " + (a>=b));//false
        System.out.println("relational Operators: " + (a<=b));//true
        System.out.println("relational Operators: " + (a!=b));//true

        //Logical Operators:    &&(and)  ||(or)   !(negation)
        //works between two boolean
        boolean x= true;
        boolean y= false;
        System.out.println("Logical Operators: "  +  (x||y));//true
        System.out.println("Logical Operators: "  +  (x&&y));//false
        System.out.println("Logical Operators: "  +  (!x));//false
        System.out.println("Logical Operators: "  +  (!y));//true

        //Increment/Decrement Operators : ++  --
         int c=10;
         c++; // or we can write this way c=c+1

         System.out.println(c);
        int d=20;
        d--;  // or we can write this way d=d-1
        System.out.println(d);
        swapValue();













    }

}
