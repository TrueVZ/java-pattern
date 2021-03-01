package state;

public class OrderedState extends State {
    @Override
    public void next(StateContext context) {
        context.setState(new DeliveredState());
    }

    @Override
    public void prev(StateContext context) {
        System.out.println("Посылка только собирается");
    }

    @Override
    public void printStatus() {
        System.out.println("Сборка посылки");

    }
}
