package strategy;

public class DefenseStategy implements ArmyStrategy {
    @Override
    public void getDescription() {
        System.out.println("Defense!");
    }
}
