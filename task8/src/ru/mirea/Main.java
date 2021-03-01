import state.StateContext;
import strategy.Army;
import strategy.AttackStrategy;
import strategy.DefenseStategy;

public class Main {
    public static void main(String[] args) {
        StateContext context = new StateContext();
        context.printStatus();
        context.nextState();
        context.printStatus();
        context.nextState();
        context.printStatus();
        context.nextState();

        Army army = new Army(new AttackStrategy());
        army.battle();
        army.setStrategy(new DefenseStategy());
        army.battle();
    }
}
