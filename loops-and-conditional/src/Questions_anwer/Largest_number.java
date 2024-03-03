package Questions_anwer;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      //  int max = 0;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

//        second way to print
//        if (a>b){
//            max=a;
//        }else {
//            max = b;
//        }
//        if (c>max){
//            max=c;
//        }

//        Third way to print

        int max = Math.max(a,Math.max(b,c));
        System.out.print(max);
    }
}
