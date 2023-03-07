package BasicsOfJava;

public class M3_JavaBreakAndContinues {
    public  static  void  main(String args[]){
        //
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("******************************");
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }
    }
}
