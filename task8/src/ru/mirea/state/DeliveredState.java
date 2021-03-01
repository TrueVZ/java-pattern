package state;

public class DeliveredState extends State {
    @Override
    public void next(StateContext context) {
        context.setState(new ReceivedState());
    }

    @Override
    public void prev(StateContext context) {
        context.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Посылка в пути");
    }
}
