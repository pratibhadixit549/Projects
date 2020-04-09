package CoffeeMachine.main;

import CoffeeMachine.coffeeMachineProcedure.CoffeeMachineProcedure;

public class CoffeeMachineMain {
    public static void main(String[] args) {
        CoffeeMachineProcedure objectOfCoffeeMachineProcedure = new CoffeeMachineProcedure(400, 540, 120, 9, 550);
        objectOfCoffeeMachineProcedure.ready();
    }
}
