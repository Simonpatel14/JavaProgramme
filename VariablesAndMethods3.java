package corejava;

public class VariablesAndMethods3 {
     // Mehtod and class don't end with ; only syntax end with ;

    //instance variable or Global Variable-variable declared inside class but Outside method or constructor eg a and b

    int            a;   // This is Called declaration= data type with variables only but not value mention
    int            b=10;
    String         name= "Frist";
    String         name1="Programme";

    //static variable or global variable-variable declared inside the class but outside the method with static keyword
    static int     c=100;
    static String  e="Happy Diwali";

    public void instanceMethod() {
        System.out.println(b);

    }

    // Static method calling in main method directly without creating object
    // other than static we need to create object to call in main method

    public static void main(String[] args) {
        //Local variable -variables declared in main method or constructor eg f and g
        int  f= 200;
        char g= 's';
        System.out.println("This is local variable declared in main method:  " + (f+g) );

        //calling or accessing static variable in static area
        System.out.println(c);
        System.out.println(e);
        System.out.println("This is static variable declared not in main method;  " + (c+e));

        //object creation for instance variable to call or assess in main method
        VariablesAndMethods3 obj=new VariablesAndMethods3();
        System.out.println(obj.b);
        System.out.println(obj.name);
        System.out.println(obj.name1);

    }

}

