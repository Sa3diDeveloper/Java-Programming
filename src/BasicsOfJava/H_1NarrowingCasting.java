package BasicsOfJava;

/*

        Narrowing casting must be done manually by placing the type in parentheses in front of the value:

        ExampleGet your own Java Server
* */
public class H_1NarrowingCasting {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);
    }
}
