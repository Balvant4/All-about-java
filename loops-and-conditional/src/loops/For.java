package loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

//        for (int a = 0; a <= 10; a += 1){
//            System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.print("Write your number:");
        int n = sc.nextInt();
        for (int num = 0; num <= n; num += 1){
            System.out.println(num);

        }
    }
}
