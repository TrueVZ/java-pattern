package strategy;

public class Army {
    private ArmyStrategy strategy;

    public Army(ArmyStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(ArmyStrategy strategy) {
        this.strategy = strategy;
    }

    public void battle(){
        strategy.getDescription();
    }
}
