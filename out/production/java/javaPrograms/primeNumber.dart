

import 'dart:io';
import 'dart:math';

bool isPrime(int n){
  if(n<=1){
    return false;
  }
  for(int i=2;i<=sqrt(n);i++){
    if(n%2==0){
     return false;
    }
  }
  return true;
 }

main(){
  print("Enter First Num: ");
  int start=int.parse(stdin.readLineSync()!);
  print("Enter First Num: ");
  int end =int.parse(stdin.readLineSync()!);
  for(int i=start;i<=end;i++){
    if(isPrime(i)){
      print(i);
    }
  }

}