package javaPrograms;

public class Factorials {
    public  static  void  main (String args[]){
        int i,fac=1;
        int num=5;
        for( i=1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println(fac);
    }
}
