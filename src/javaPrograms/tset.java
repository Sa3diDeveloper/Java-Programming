package javaPrograms;

public class tset {
    public  static  void  main(String args[]){
        int firstNum=0,secondNum=1,res=0;
       // System.out.println(firstNum+""+secondNum);
        for(int i=2;i<10;i++){
            res=firstNum+secondNum;
            System.out.println(""+res);
            firstNum=secondNum;
            secondNum=res;
        }
    }
}
