package loops;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ask the number:-");
        int input = sc.nextInt();

        int num = 1;
        do {
            System.out.println("Balvant kumar");
            num++;
        }while (num <= input);;
    }
}
