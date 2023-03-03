package BasicsOfJava;
/*
 Boolean Types
         Very often in programming, you will need a data type that can only have one of two values, like:

         YES / NO
         ON / OFF
         TRUE / FALSE
         For this, Java has a boolean data type, which can only take the values true or false:
         */
public class J_booleanDataType {
    public  static  void  main (String args[]){

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
