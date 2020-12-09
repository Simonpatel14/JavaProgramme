package corejava;

public class StringVariableAndMethods4 {
    public void nonStaticTEST() {
        char c = 'F';
        boolean l= true;
        System.out.println(c);
        System.out.println(l);
    }

    public static void staticTest() {
        int a = 10;
        double d = 20.5;
        System.out.println(a + d); // operators is + sign

    }

        public static void main (String[]args){
            //String Literal -String Constant Pool
            String str  = "This is my First string";
            String str1 = "Hello";
            String str2 = "Welcome";
            String str3 = "";
            String str4 = "           This is my test String    ";
            String str5 = "Hello";
            System.out.println("length of the String is:  "  + str.length());
            System.out.println("Character at index 2 is:  " + str.charAt(2));
            System.out.println("concatenate sentence is:  " + str.concat(" and include Methods as well "));
            System.out.println("Contains Check 1:  "  + str.contains("First"));
            System.out.println("Contains check 2:  " + str.contains("Frist"));
            System.out.println("Starts with Check 1:  "  +  str.startsWith("This"));
            System.out.println("Starts with check 2:  "  +  str.startsWith("is"));
            System.out.println("Ends with Check 1:  "  +  str.endsWith("string"));
            System.out.println("Ends with check 2:  "  +  str.endsWith("is"));
            System.out.println("Checks Contains are equals:  "  +  str.equals("str1"));
            System.out.println("Checks Contains are equals:  "  +  str5.equals("str1"));
            System.out.println("Index of I:  "  +  str.indexOf('i'));
            System.out.println("Check if string is empty 1:  "  + str.isEmpty());
            System.out.println("Check if string is empty 2:  "  + str3.isEmpty());
            System.out.println("Trim the leading & Trailing Space:  "  + str4.trim());
            System.out.println("Replace Example:  " + str4.replace('e', 'a'));
            System.out.println("Substring Example 1:  "  +str.substring(3));
            System.out.println("Substring Example 2:  "  +str.substring(1,9));
            System.out.println("output string to display; " + str.substring(0,3));//it goes upto 2 index not 3 but need to write next


            char[] charArray = str.toCharArray();
            for(int i=0;i<charArray.length; i++) {
                System.out.println("Index " + i  + "is "  + charArray[i]);
            }
            System.out.println("Uppercase: " + str.toUpperCase());
            System.out.println("Lowercase: " +str.toLowerCase());


            // String object = Heap
            String obj = new String();
            StringVariableAndMethods4 sbj = new StringVariableAndMethods4();
            sbj.nonStaticTEST();
            staticTest();
        }
    }















