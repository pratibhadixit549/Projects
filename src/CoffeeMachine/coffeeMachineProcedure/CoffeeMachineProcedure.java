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
        }
    }

    private void buy() {
        System.out.println("What do you eany to buy? 1 - espresso, 2 - latte, 3 - cappucino, back - to main menu: ");
        String choice = scanner.next();
        boolean enough = isEnough(choice);
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

        return enough;
    }


}
