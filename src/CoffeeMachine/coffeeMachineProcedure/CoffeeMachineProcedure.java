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

    }
}
