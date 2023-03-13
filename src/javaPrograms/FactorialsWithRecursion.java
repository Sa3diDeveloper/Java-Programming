package javaPrograms;

public class FactorialsWithRecursion {
 static  int factorial(int n){
     if(n==0){
         return  1;
     }
     return  (n*factorial(n-1));
 }
    public  static  void  main (String args[]){
        int i,fac=1;
        int num=5;

        System.out.println(factorial(num));
    }
}
