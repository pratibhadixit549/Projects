package SimpleChattyBot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2018");
        remindName();
        guessAge();
        count();
    }

    private static void count() {
    }

    private static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    private static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    private static void greet(String assintantName, String birthYear) {
        System.out.println("Hello! My name is " + assintantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me yoor5 name.");
    }
}
