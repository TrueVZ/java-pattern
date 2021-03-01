package strategy;

public class AttackStrategy implements ArmyStrategy {
    @Override
    public void getDescription() {
        System.out.println("Attack!!!");
    }
}
