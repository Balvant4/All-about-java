package Questions_anwer;

import java.util.Scanner;


public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        if (a.equals("a") || a.equals("z")) {
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }

    }
}
