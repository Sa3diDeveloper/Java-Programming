package variables;

public class StringsInJava {
    public static void main(String[] args) {
   
        String s1 = "stringone";
        String s2 = "stringtwo";
        String s3 = s1 + s2 + "LIT";

        s3 = s3.toUpperCase();

        System.out.println(s3.replace('G', '9'));
        System.out.println(s3);

        String s = "The program says: \\ \"Hello World\"";
        System.out.println(s);
    }
}
