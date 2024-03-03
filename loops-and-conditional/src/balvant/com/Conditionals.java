package balvant.com;

public class Conditionals {
    public static void main(String[] args) {
        int age = 56;
        if (age < 13) {
            System.out.println("You are a child");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You are an adult");
        } else if (age >= 40 && age <= 59) {
            System.out.println("You are old");
        } else {
            System.out.println("Wrong input");
        }
    }
}
