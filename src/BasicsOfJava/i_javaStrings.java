package BasicsOfJava;

public class i_javaStrings {
    public  static  void  main(String args[]){
      /*  Java
        Strings are used for storing text.

        A String variable contains a collection of characters surrounded by double quotes:

        ExampleGet your own Java Server
        Create a variable of type String and assign it a value:

*/

        String greeting = "Hello";

     //   String Length
      //  A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:


        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());




        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

       // Finding a Character in a String
        //The indexOf() method returns the index (the position) of the first occurrence of a
        // specified text in a string (including whitespace):


        String txt1= "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7


        /*
\n	New Line
\r	Carriage Return
\t	Tab
\b	Backspace
\f	Form Feed
        */
    }
}
