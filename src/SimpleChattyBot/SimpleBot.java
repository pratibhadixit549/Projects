package SimpleChattyBot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2018");
        remindName();
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
