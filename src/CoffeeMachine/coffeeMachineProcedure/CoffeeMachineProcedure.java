package CoffeeMachine.coffeeMachineProcedure;

import java.util.Scanner;

public class CoffeeMachineProcedure {
    final static Scanner scanner = new Scanner(System.in);

    private int waterInCoffeeMachine;
    private int milkInCoffeeMachine;
    private int coffBeansInCoffeeMachine;
    private int disposableCupsInCoffeeMachine;
    private int moneyInCoffeeMachine;

    public CoffeeMachineProcedure(int waterInCoffeeMachine, int milkInCoffeeMachine, int coffBeansInCoffeeMachine, int disposableCupsInCoffeeMachine, int moneyInCoffeeMachine) {
        this.waterInCoffeeMachine = waterInCoffeeMachine;
        this.milkInCoffeeMachine = milkInCoffeeMachine;
        this.coffBeansInCoffeeMachine = coffBeansInCoffeeMachine;
        this.disposableCupsInCoffeeMachine = disposableCupsInCoffeeMachine;
        this.moneyInCoffeeMachine = moneyInCoffeeMachine;
    }

    public void ready() {
        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action = scanner.next();
        processReadyCommand(action);
    }

    private void processReadyCommand(String action) {
        System.out.println();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }
    }

    private void take() {

    }

    private void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int waterAdded = scanner.nextInt();
        System.out.println("Write how mnay ml of milk do you want to add:");
        int milkAdded = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffeeBeansAdded = scanner.nextInt();
        System.out.println("Write how many cups of coffee do you want to add:");
        int disposableCupsAdded = scanner.nextInt();

        this.waterInCoffeeMachine += waterAdded;
        this.milkInCoffeeMachine += milkAdded;
        this.coffBeansInCoffeeMachine += coffeeBeansAdded;
        this.disposableCupsInCoffeeMachine += disposableCupsAdded;

        ready();
    }

    private void buy() {
        System.out.println("What do you eany to buy? 1 - espresso, 2 - latte, 3 - cappucino, back - to main menu: ");
        String choice = scanner.next();
        boolean enough = isEnough(choice);
        switch (choice) {
            case "1": {//espresso
                if (enough) {
                    this.waterInCoffeeMachine -= 250;
                    this.coffBeansInCoffeeMachine -= 16;
                    this.disposableCupsInCoffeeMachine -= 1;
                    this.moneyInCoffeeMachine += 4;
                }
                break;
            }
            case "2": {//latte

                if (enough) {
                    this.waterInCoffeeMachine -= 350;
                    this.milkInCoffeeMachine -= 75;
                    this.coffBeansInCoffeeMachine -= 20;
                    this.disposableCupsInCoffeeMachine -= 1;
                    this.moneyInCoffeeMachine += 7;
                }
                break;
            }
            case "3": {//cappucino
                if (enough) {
                    this.waterInCoffeeMachine -= 200;
                    this.milkInCoffeeMachine -= 100;
                    this.coffBeansInCoffeeMachine -= 12;
                    this.disposableCupsInCoffeeMachine -= 1;
                    this.moneyInCoffeeMachine += 6;
                }
                break;
            }
            case "break": {
                break;
            }
            default: {
                System.out.println("unknown buy state");
                //
                break;
            }
        }
        ready();
    }

    private boolean isEnough(String type) {
        boolean enough = false;

        int waterLimit;
        int milkLimit;
        int coffeeBeansLimit;

        switch (type) {
            case "1": {
                waterLimit = 250;
                milkLimit = 0;
                coffeeBeansLimit = 16;
                break;
            }
            case "2": {
                waterLimit = 350;
                milkLimit = 75;
                coffeeBeansLimit = 20;
                break;
            }
            case "3": {
                waterLimit = 200;
                milkLimit = 100;
                coffeeBeansLimit = 12;
                break;
            }
            default: {
                return false;
            }
        }
        if (this.waterInCoffeeMachine < waterLimit) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milkInCoffeeMachine < milkLimit) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.coffBeansInCoffeeMachine < coffeeBeansLimit) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.disposableCupsInCoffeeMachine < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            enough = true;
            System.out.println("I have enough resources, making you a coffee!");
        }

        return enough;
    }
}
