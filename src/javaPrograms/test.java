package javaPrograms;

import java.util.Scanner;

public class test {
    public  static  void  main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int start=scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int end=scanner.nextInt();
        for(int i=start;i<=end;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return  false;

            }
        }
        return  true;
    }
}
