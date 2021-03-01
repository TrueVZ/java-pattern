package abstractFactory;

public class FactoryMaker {
    public enum PeripheryType {
        RAZ, LOG
    }

    public static PeripheryFactory makeFactory(PeripheryType type){
        switch (type) {
            case LOG:
                return new LogitechFactory();
            case RAZ:
                return new RazerFactory();
            default:
                throw new IllegalArgumentException("Type not supported");
        }
    }
}
