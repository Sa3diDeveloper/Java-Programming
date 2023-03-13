class Fun{
 static int firstNum=0,secunNum=1,res=0;
  static fib(int count){
    if(count>0){
     res=firstNum+secunNum;
     print(res);
     firstNum=secunNum;
     secunNum=res;
   //  fib(count-1);
    }
  }
}
main(){
  var fun=Fun();
  int count=10;
  print(Fun.fib(count));
}